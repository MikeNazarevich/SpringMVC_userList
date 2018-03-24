import React, { Component } from 'react';
import User from './User';
import './UsersList.css';

class UsersList extends Component {
    constructor() {
        super();
        this.state = {
          isLoaded: false
        }
      }    

    componentDidMount() {
        fetch('http://localhost:8050/')
        
          .then((data) => data.json())
          .then((data) => {
            this.setState({
              data: data,   
              isLoaded: true
            })
          })
    }
    render() {
        if (this.state.isLoaded === false)
            return null;
  
        return (
            <div className="UsersList">
                <ul> 
                    {
                        this.state.data.map((lol, i) =>
                            
                            <li key={i}>
                                <User id={lol.id}
                                    username={lol.username} />
                            </li>
                        )
                    }
                </ul>
            </div>
        )
    }
}

export default UsersList;
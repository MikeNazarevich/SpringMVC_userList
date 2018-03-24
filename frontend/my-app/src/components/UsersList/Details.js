import React, { Component } from 'react';
import UserDetails from './UserDetails';


class Details extends Component {
    constructor() {
        super();
        this.state = {
          isLoaded: false
        }
    }

    componentDidMount() {
        fetch('http://localhost:8050/qwerty/user/detail_info')
        
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

        const data = this.state.data;

        return(
            <div className="Details">
                <UserDetails name={data.name}
                             surname={data.surname}
                             username={data.username}/>
            </div>
        )
    }
}

export default Details;
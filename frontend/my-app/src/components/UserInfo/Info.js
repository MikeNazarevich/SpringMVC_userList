import React, { Component } from 'react';
import UserInfo from './UserInfo';

class Info extends Component {
    constructor() {
        super();
        this.state={
          data:{},
          cars:[],
          roles:[]
        }
      }
     
      componentDidMount() {
        fetch('http://localhost:8050/qwerty/user/detail_info')
        
          .then((data) => data.json())
          .then((findData) => {
              this.setState({
                data:findData,
                cars:findData.cars,
                roles:findData.roles
              })
            })
      }

      render() {
        // console.log(this.state.data.name);
        this.state.cars.map((lol, i) => console.log(lol.name));
        this.state.roles.map((lol, i) => console.log(lol.privilege));
        const base = this.state.data;
        return (
            <div>
                <UserInfo name={base.name}
                          surname={base.surname}
                          username={base.username}/>

                <div>
                    {
                        this.state.cars.map((lol, i) => 
                            <img key={i} src={lol.photo} alt={lol.name}/>
                    
                        )
                    }
                </div>
                
                <div>
                    {
                        this.state.roles.map((lol, i) =>
                            <p key={i}>{lol.privilege}</p>
                        )
                    }
                </div>
                    
            </div>
        )
    }
}

export default Info
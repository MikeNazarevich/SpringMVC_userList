import React, { Component } from 'react';
import CarInfo from './CarInfo';

class CarList extends Component {
    constructor() {
        super();
        this.state = {
          isLoaded: false
        }
      }    

    componentDidMount() {
        fetch('http://localhost:8050/cars')
        
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
            <div className="CarList">
                <ul> 
                {
                    this.state.data.map((kek, j) =>
                        
                        <li key={j}>
                            <CarInfo name={kek.name}
                                     photo={kek.photo} />
                        </li>
                    )
                }
                </ul>
            </div>
        )
    }
}

export default CarList;
import React, { Component } from 'react';

class CarInfo extends Component {
    render() {
        return (
            <div className="CarInfo">
                <p>{this.props.name}</p>
                <img src={this.props.photo} alt={this.props.name}/>
            </div>
        )
    }
}

export default CarInfo;
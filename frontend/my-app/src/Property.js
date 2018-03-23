import React, { Component } from 'react';


class Property extends Component {
    render() {
        return (
            <div className="Property">
                <p>{this.props.id}</p>
                <p>{this.props.username}</p>
            </div>
        )
    }
}

export default Property;
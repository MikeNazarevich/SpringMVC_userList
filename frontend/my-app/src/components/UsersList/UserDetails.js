import React, { Component } from 'react';

class UserDetails extends Component {

    render() {
        return (
            <div className="UserDetails">
                <p className="name">{this.props.name}</p>
                <p className="surname">{this.props.surname}</p>
                <p className="username">{this.props.username}</p>
            </div>
        )
    }
}

export default UserDetails;
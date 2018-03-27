import React, { Component } from 'react';

class UserInfo extends Component {
    render() {
        return (
            <div className="UserInfo">
                <p className="name">{this.props.name}</p>
                <p className="surname">{this.props.surname}</p>
                <p className="username">{this.props.username}</p>
            </div>
        )
    }
}

export default UserInfo;
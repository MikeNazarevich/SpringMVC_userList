import React, { Component } from 'react';

class User extends Component {
    render() {
        return (
            <div className="user">
                <p className="id">{this.props.id}</p>
                <a href="#"><p className="username">{this.props.username}</p></a>
                <a href="'{this.props.id}'/user/delete"><p>delete</p></a>
            </div>
        );
    }       
}

export default User;
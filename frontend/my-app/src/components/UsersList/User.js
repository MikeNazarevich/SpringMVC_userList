import React, { Component } from 'react';

class User extends Component {
    render() {
        var str = this.props.id + '/user/delete';
        return (
            <div className="User">
                <p className="id">{this.props.id}</p>
                <a href="#"><p className="username">{this.props.username}</p></a>
                <a href={this.props.id + '/user/delete'} >delete</a>
            </div>
        );
    }       
}

export default User;
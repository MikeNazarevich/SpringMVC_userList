import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import UsersList from './components/UsersList/UsersList';
import CarList from './components/CarsList/CarsList';
import Details from './components/UsersList/Details';

class App extends Component {
 
  // componentDidMount() {
  //   fetch('http://localhost:8050/qwerty/user/detail_info')
    
  //     .then((data) => data.json())
  //     .then((data) => {
  //       this.setState({
  //         data: data,
  //         isLoaded: true
  //       })
  //     })
  // }


  
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
        <UsersList />
        <CarList />
        <Details />
      </div>
    );
  }
}

export default App;

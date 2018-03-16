import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor() {
    super();
    this.state = {
      isLoaded: false
    }
  }

  componentDidMount() {
    fetch('http://localhost:8050/login')
      .then((data) => data.json())
      .then((data) => {
        this.setState({
          data: data,
          isLoaded: true
        })
      })
  }
  
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

        <input type="text"/>
        <input type="text"/>
      </div>
    );
  }
}

export default App;

import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Property from './Property';

class App extends Component {
  constructor() {
    super();
    this.state = {
      isLoaded: false
    }
  }

  componentDidMount() {
    fetch('http://localhost:8050/')
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

    const data = this.state.data;
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
          <Property property={data.username} />
      </div>
    );
  }
}

export default App;

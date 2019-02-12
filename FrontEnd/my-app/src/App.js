import React, { Component } from 'react';
import logo from './logo.svg';
import axios from 'axios';
import './App.css';

class App extends Component {

    state = {
        persons: []
    };

    componentDidMount() {
        axios.get('http://localhost:8080')
            .then(res => {
                const persons = res.data;
                this.setState({ persons });
            })
    }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
            <ul>
                { this.state.persons.map(person => <li>{person.name}</li>)}
                { this.state.persons.map(person => <li>{person.summonerLevel}</li>)}
            </ul>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export default App;

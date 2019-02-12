import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component {
    state = {
        persons: []
    };
    componentDidMount() {
        axios.get(`http://localhost:8080`)
            .then(res => {
                const persons = res.data;
                this.setState({ persons });
            })
    }

    render() {
        return (
            <ul>
                { this.state.persons.map(person => <li>{person.name}</li>)}
            </ul>
        )
    }

}

export default App;

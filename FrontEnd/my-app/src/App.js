import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import Header from './components/header';
import Panel from './components/panel';

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
                <Header/>
                { this.state.persons.map(person => <li>{person.name}</li>)}
                <Panel/>

            </ul>

        )
    }

}

export default App;

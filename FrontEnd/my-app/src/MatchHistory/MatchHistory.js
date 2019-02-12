import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import { withStyles } from '@material-ui/core/styles';

const style = theme => {
    #li = ""
};

class MatchHistory extends Component {
    state = {
        persons: []
    };
    componentDidMount() {
        axios.get(`http://localhost:8080/test`)
            .then(res => {
                const persons = res.data;
                this.setState({ persons });
            })
    }

    render() {
        return (
            <ul>
                { this.state.persons.map(person => <li>{person.name}</li>)}
                { this.state.persons.map(person => <li>{person}</li>)}
            </ul>
        )
    }
}

export default withStyles(style) (MatchHistory);
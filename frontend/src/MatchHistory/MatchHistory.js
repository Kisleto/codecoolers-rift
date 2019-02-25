import React, { Component } from 'react';
import axios from 'axios';
import { withStyles } from '@material-ui/core/styles';

const style = theme => {

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
            </ul>
        )
    }
}

export default withStyles(style) (MatchHistory);
import Header from "./components/header";
import Panel from "./components/panel";
import React, {Component} from "react";
import axios from "axios";

class InfoPage extends Component{
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
            <div>
            <Header/>
        { this.state.persons.map(person => <li>{person.name}</li>)}
        <Panel/>
            </div>
        )
    }

}
export default InfoPage
import Header from "./components/header";
import Panel from "./components/panel";
import React, {Component} from "react";
import axios from "axios";
import Rank from "./components/Rank"

class InfoPage extends Component {
    state = {
        persons: []
    };

    componentDidMount() {
        axios.get(`http://localhost:8080/euw1/VoidWar`)
            .then(res => {
                const persons = res.data;
                this.setState({persons});

            })
    }

    render() {
        return (
            <div>
                <Panel persons={this.state.persons}/>
            </div>
        )
    }

}

export default InfoPage
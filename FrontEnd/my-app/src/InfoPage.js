import Header from "./components/header";
import Panel from "./components/panel";
import React, {Component} from "react";
import axios from "axios";
class InfoPage extends Component{
    state = {
        persons: []
    };
    componentDidMount() {
        axios.get(`http://localhost:8080/euw1/VoidWar`)
            .then(res => {
                const persons = res.data;
                this.setState({ persons });

            })
    }

    render() {
        console.log(this.state.persons);
        return (
            <div>
            <Header/>
            <Panel persons={this.state.persons}/>
            </div>
        )
    }

}
export default InfoPage
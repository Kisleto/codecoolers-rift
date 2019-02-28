import Panel from "./components/panel";
import React, {Component} from "react";
import axios from "axios";

class InfoPage extends Component {
    state = {
        persons: [],
        name: ""
    };

    constructor(props) {
        super(props);
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/euw1/${this.state.name}`)
            .then(res => {
                const persons = res.data;
                this.setState({persons});

            });
    }


    componentWillReceiveProps(props) {
        this.setState({name: props});
        console.log("__________________________________");
        console.log(this.state.name)
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
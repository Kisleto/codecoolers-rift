import Panel from "./components/panel";
import React, {Component} from "react";

class InfoPage extends Component {
    state = {
        persons: [],
        name: ""
    };

    constructor(props) {
        super(props);
    }




    componentWillReceiveProps(props) {
        this.setState({persons: props});
        console.log("__________________________________");
        console.log(props)
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
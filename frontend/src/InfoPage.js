import Panel from "./components/panel";
import React, {Component} from "react";

class InfoPage extends Component {
    state = {
        people: [],
        name: "",
        region: ""
    };

    constructor(props) {
        super(props);
    }




    componentWillReceiveProps(props) {
        this.setState({people: props});
        this.setState({region: props.region});
    }

    render() {
        return (
            <div>
                <Panel peeps={this.state.people} region={this.state.region}/>
            </div>
        )
    }

}

export default InfoPage
import Panel from "./components/panel";
import React, {Component} from "react";

class InfoPage extends Component {
    state = {
        people: [],
        name: ""
    };

    constructor(props) {
        super(props);
    }




    componentWillReceiveProps(props) {
        this.setState({people: props});
        console.log("__________________________________");
        console.log(props)
    }

    render() {
        return (
            <div>
                <Panel peeps={this.state.people}/>
            </div>
        )
    }

}

export default InfoPage
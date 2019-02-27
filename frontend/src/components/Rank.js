import React, {Component} from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import {Grid} from "./panel";


class Rank extends Component {
    constructor(props) {
        super(props);
    }

    state = {
        persons: [],
    };

    componentWillReceiveProps(props) {
        this.setState((prevState) => ({persons: props.persons}));
    }

    render() {
        return (
            <div>
                <div className="box">
                    {this.state.persons.ranks !== undefined &&
                    <div>
                        {Array.from(this.state.persons.ranks).map((value, i) => <li
                            key={i}>{value.queueType}</li>)}
                    </div>
                    }{this.state.persons.ranks !== undefined &&
                <div>{Array.from(this.state.persons.ranks).map((value, i) => <li
                    key={i}>{value.tier}</li>)}</div>
                }
                </div>
            </div>
        )
    }
}

/*Rank.propTypes = {
    classes: PropTypes.object.isRequired,
}; */

export default Rank;
import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import {Grid} from 'gymnast'
import Rank from "./Rank";
import axios from "axios";
import './components.css'
import '../index.css'


const styles = theme => ({
    grid: {
        backgroundColor: "red",
    },
    box: {
        width: 190,
        borderWidth: 1,
        backgroundColor: "white",
        marginLeft: 18,
        boxShadow: `0px 0px 3px`,
    },
    level: {
        right: 1
    },
    name: {
        width: 190,
        borderWidth: 1,
        backgroundColor: "#f2f2f2",
        marginLeft: 18,
        boxShadow: `0px 0px 3px`,
        marginTop: 10,
    },
    avatar: {
        display: "block",
        maxWidth: 100,
        maxHeight: 100,
        width: "auto",
        height: "auto",
        float: "left"
    }
});


class Panel extends Component {
    constructor(props) {
        super(props);
    }


    state = {
        persons: [],
        match: []
    };

    componentWillReceiveProps(props) {
        console.log("EZ A PANELE");
        console.log(props);
        console.log("=================");
        this.setState((prevState) => ({persons: props.persons}));

    }

    render() {
        const {classes} = this.props;
        console.log(this.state.persons);
        /*let matchElement = document.getElementsByClassName("matchesData");
        for (let match of persons.matches) {
            let matchId = match.seasonId;
            let currentPlatformId = match.participantIdentities.currentPlatformId;
            let div = `<tr>
                        <td>${matchId}</td>
                        <td>${currentPlatformId}</td>
                        </tr>`;
            matchElement.innerHTML += div;
        }*/
        return (
            <div className="big div">
                <div id="wrapper">
                    <div id="first">
                        <Grid className={classes.name} size={7} margin={2}>
                            <img className={classes.avatar}
                                 src={`http://avatar.leagueoflegends.com/euw/${this.props.persons.name}.png`}
                                 alt="new"
                            />
                            {this.state.persons.name} <br/> {this.state.persons.summonerLevel}
                        </Grid>
                        <div>
                            <div className={classes.box}>
                                <ul style={{listStyleType: "none", paddingLeft: 4}}>
                                    {this.state.persons.ranks !== undefined &&
                                    <div>
                                        {Array.from(this.state.persons.ranks).map((value, i) => <li
                                            key={i}>{value.queueType} <br/> {value.tier}</li>)}
                                    </div>
                                    }
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div id="champ">
                        <Grid margin={2}>
                            <table className="table table-bordered">
                                <thead>
                                <tr>
                                    <th>Champion Level</th>
                                    <th>Champion Points</th>
                                    <th>Champion ID</th>
                                </tr>
                                </thead>
                                <tbody className="matchesData">
                                <tr>
                                    {this.state.persons.mastery_level !== undefined &&
                                    <td>{Array.from(this.state.persons.mastery_level).map((value, i) => <li
                                        key={i}>{value.championLevel}</li>)}</td>
                                    }
                                    {this.state.persons.mastery_level !== undefined &&
                                    <td>{Array.from(this.state.persons.mastery_level).map((value, i) => <li
                                        key={i}>{value.championPoints}</li>)}</td>
                                    }
                                    {this.state.persons.mastery_level !== undefined &&
                                    <td>{Array.from(this.state.persons.mastery_level).map((value, i) => <li
                                        key={i}>{value.championId}</li>)}</td>
                                    }
                                </tr>
                                </tbody>

                            </table>
                        </Grid>
                    </div>
                </div>
                <Grid className="Grid" margin={2}>
                    <table className="table table-bordered">
                        <thead className="thead-light">
                        <tr>
                            <th>matchID</th>
                            <th>CurrentPlatformId</th>
                        </tr>
                        </thead>
                        <tbody className="matchesData">
                        <tr>
                            <ul style={{listStyleType: "none", paddingLeft: 0}}>
                                {this.state.persons.matches !== undefined &&
                                <td>{Array.from(this.state.persons.matches).map((value, i) => <li
                                    key={i}>{value.gameId}</li>)}</td>
                                }
                            </ul>
                        </tr>
                        </tbody>

                    </table>
                </Grid>
            </div>
        )
    };
}

Panel.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(Panel);

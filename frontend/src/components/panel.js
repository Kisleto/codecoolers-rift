import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import {Grid} from 'gymnast'
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
        let people = props.peeps.people;
        this.setState((prevState) => ({persons: people}));

    }


    render() {
        const {classes} = this.props;

        return (
            <div className="big div">
                <div id="wrapper">
                    <div id="first">
                        <Grid className={classes.name} size={7} margin={2}>
                            <img className={classes.avatar}
                                 src={`http://avatar.leagueoflegends.com/euw/${this.state.persons.name}.png`}
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
                                <tr style={{listStyleType: "none"}}>
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
                <div id="blueTeam"><h3 id="blue">Blue Team</h3></div>
                <Grid margin={2}>
                    <table className="table table-bordered">
                        <thead>
                        <tr>
                            <th>Summoner Name</th>
                            <th>Participant ID</th>
                            <th>Win</th>
                            <th>Kills</th>
                            <th>Deaths</th>
                            <th>Assists</th>
                            <th>Largest Killing Spree</th>
                            <th>Largest Multi Kill</th>
                        </tr>
                        </thead>
                        <tbody className="matchesData">
                        <tr style={{listStyleType: "none", paddingLeft: 0}}>
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.summonerName}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.participantId}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.win}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.kills}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.deaths}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.assists}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.largestKillingSpree}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.blueTeam).map((value, i) => <li
                                key={i}>{value.stats.largestMultiKill}</li>)}</td>
                            }
                        </tr>
                        </tbody>

                    </table>
                </Grid>
                <div id="redTeam"><h3 id="red">Red Team</h3></div>
                <Grid margin={2}>
                    <table className="table table-bordered">
                        <thead>
                        <tr>
                            <th>Summoner Name</th>
                            <th>Participant ID</th>
                            <th>Win</th>
                            <th>Kills</th>
                            <th>Deaths</th>
                            <th>Assists</th>
                            <th>Largest Killing Spree</th>
                            <th>Largest Multi Kill</th>
                        </tr>
                        </thead>
                        <tbody className="matchesData">
                        <tr style={{listStyleType: "none", paddingLeft: 0}}>
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.summonerName}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.participantId}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.win}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.kills}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.deaths}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.assists}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.largestKillingSpree}</li>)}</td>
                            }
                            {this.state.persons.lastGameInfo !== undefined &&
                            <td>{Array.from(this.state.persons.lastGameInfo.redTeam).map((value, i) => <li
                                key={i}>{value.stats.largestMultiKill}</li>)}</td>
                            }
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

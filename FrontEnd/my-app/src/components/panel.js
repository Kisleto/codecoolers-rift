import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import {Grid} from 'gymnast'

const styles = theme => ({
    grid: {
        backgroundColor: "blue",
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
        console.log('JEEEEEEEEEEEEEEEEEEEEEE')
        console.log(props);
        this.setState((prevState) => ({persons: props.persons}));

    }

    render() {
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
// className={this.props.classes.grid}
        return (
            <div>
                <Grid size={7} margin="2 2 2 0">{this.state.persons.name}</Grid>
                <Grid size={5} margin={2}>{this.state.persons.name} </Grid>

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
                            <ul>
                            {this.state.persons.matches !== undefined &&
                                <td>{Array.from(this.state.persons.matches).map((value, i) => <li key={i}>{value.gameMode}</li>)}</td>
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

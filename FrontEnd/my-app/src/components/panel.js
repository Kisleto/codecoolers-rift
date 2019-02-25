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
        match: []
    };

    render() {
        const {classes, persons} = this.props;
        console.log(persons.match);
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
            <div>
                <Grid size={7} margin="2 2 2 0">{persons.name}</Grid>
                <Grid className={classes.grid} size={5} margin={2}>{persons.name} </Grid>

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
                            <td>{persons.summonerLevel}</td>
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

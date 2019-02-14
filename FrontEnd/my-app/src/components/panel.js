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

        return (
            <div>
                <Grid size={7} margin="2 2 2 0">{persons.name}</Grid>
                <Grid className={classes.grid} size={5} margin={2}>{persons.name} </Grid>

                <Grid margin={2}>{persons.name}</Grid>
            </div>
        )
    };
}

Panel.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(Panel);

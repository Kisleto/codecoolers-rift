import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import { Container } from 'react-bootstrap';
import { Navbar } from 'react-bootstrap';

function DetailedExpansionPanel(props) {
    const { classes } = props;
    return (
        <Container>
            <Navbar expand="lg" variant="light" bg="dark">
                <Navbar.Brand href="#">Navbar</Navbar.Brand>
            </Navbar>
        </Container>
    );
}

DetailedExpansionPanel.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default DetailedExpansionPanel;
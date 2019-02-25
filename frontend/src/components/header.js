import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import { Navbar } from 'react-bootstrap';
import Nav from "react-bootstrap/Nav";
import Form from "react-bootstrap/Form";
import Button from "@material-ui/core/Button/Button";
import SearchField from "react-search-field";
import NavDropdown from "react-bootstrap/NavDropdown";


const styles = theme => ({
    formLine: {
        backgroundColor : "blue",
    },
    searchField : {


    }

});

function DetailedExpansionPanel(props) {

    const { classes } = props;
    return (
            <Navbar bg="dark" variant="dark">
                <Navbar.Brand href="#home">Codecoolers Rift</Navbar.Brand>
                <Nav className="mr-auto">
                    <Nav.Link href="#home">Home</Nav.Link>
                    <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                        <NavDropdown.Item href="#action/3.1">NA</NavDropdown.Item>
                        <NavDropdown.Item href="#action/3.2">EUNE</NavDropdown.Item>
                        <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
                        <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
                    </NavDropdown>
                </Nav>
                <Form inline>
                    <SearchField
                        placeholder="Search..."
                        //onChange={onChange}
                        classNames="searchField"
                    />
                    <Button variant="outline-info">Search</Button>
                </Form>
            </Navbar>
    );
}

DetailedExpansionPanel.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(styles) (DetailedExpansionPanel);
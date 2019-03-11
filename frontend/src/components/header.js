import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import {Navbar} from 'react-bootstrap';
import Nav from "react-bootstrap/Nav";
import Button from "@material-ui/core/Button/Button";
import NavDropdown from "react-bootstrap/NavDropdown";
import InfoPage from "../InfoPage";
import axios from "axios";


const styles = theme => ({
    formLine: {
        backgroundColor: "blue",
    },
    searchField: {}

});

class DetailedExpansionPanel extends Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.state = {
            persons: [],
            data: ""
        }
    }


    handleSummonerNameChange(event) {
        this.setState({data: event.target.value});
    }

    handleSubmit(event) {
        event.preventDefault();
        axios.get(`http://localhost:8080/euw1/${this.state.data}`) // TODO Make this constant!!!
            .then(res => {
                const persons = res.data;
                this.setState({persons});

            });
    }

    render() {
        return (
            <div>
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
                    <form onSubmit={this.handleSubmit}>
                        <input value={this.state.data} onChange={event => this.handleSummonerNameChange(event)}
                               placeholder="Search..."
                            //onChange={onChange}
                               classNames="searchField"
                        />
                        <Button variant="outline-info" type='submit'>Search</Button>
                    </form>
                </Navbar>
                <div>
                    <InfoPage people={this.state.persons}/>
                </div>
            </div>


        );
    }



}


DetailedExpansionPanel.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(DetailedExpansionPanel);
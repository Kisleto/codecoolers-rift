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
            data: "",
            region: ""
        }
    }


    handleSummonerNameChange(event) {
        this.setState({data: event.target.value});
    }

    handleRegionChange(e) {
        this.setState({region: e.target.value});
        console.log(this.state.region)
    }
    handleSubmit(event) {
        let riotAPIUrl = `http://localhost:8080/${this.state.region}/${this.state.data}`
        event.preventDefault();
        axios.get(riotAPIUrl // TODO Make this constant!!!
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
                        <NavDropdown title="Region" id="basic-nav-dropdown">
                            <button className="button" value="na1"
                                    onClick={event => this.handleRegionChange(event)}>NA
                            </button>
                            <br></br>
                            <button className="button" value="eun1"
                                    onClick={event => this.handleRegionChange(event)}>EUNE
                            </button>
                            <br></br>
                            <button className="button" value="euw1"
                                    onClick={event => this.handleRegionChange(event)}>EUW
                            </button>
                        </NavDropdown>
                        <Button variant="outlined"> Login </Button>
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
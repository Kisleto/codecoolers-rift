import React, {Component} from 'react';
import './App.css';
import Header from "./components/header";
import {HashRouter} from "react-router-dom";
import {withStyles} from "@material-ui/core";
import PropTypes from "prop-types";
import {Navbar, Button} from 'react-bootstrap';


const styles = theme => ({
    formLine: {
        backgroundColor : "blue",
    },
    searchField : {
        marginLeft : 700,
        marginTop : 300,
    }

});

class App extends Component {
    goTo(route) {
        this.props.history.replace(`/${route}`)
    }

    login() {
        this.props.auth.login();
    }

    logout() {
        this.props.auth.logout();
    }

    componentDidMount() {
        const {renewSession} = this.props.auth;

        if (localStorage.getItem('isLoggedIn') === 'true') {
            renewSession();
        }
    }


    render() {
        return (
            <div>
                <Navbar fluid>
                    <Navbar.Header>
                        <Navbar.Brand>
                            <a href="#">Auth0 - React</a>
                        </Navbar.Brand>
                        <Button
                            bsStyle="primary"
                            className="btn-margin"
                            onClick={this.goTo.bind(this, 'home')}
                        >
                            Home
                        </Button>
                        {
                            (
                                <Button
                                    id="qsLoginBtn"
                                    bsStyle="primary"
                                    className="btn-margin"
                                    onClick={this.login.bind(this)}
                                >
                                    Log In
                                </Button>
                            )
                        }
                        {
                            (
                                <Button
                                    id="qsLogoutBtn"
                                    bsStyle="primary"
                                    className="btn-margin"
                                    onClick={this.logout.bind(this)}
                                >
                                    Log Out
                                </Button>
                            )
                        }
                    </Navbar.Header>
                </Navbar>
                <HashRouter>
                    <div>
                        <Header/>
                    </div>
                </HashRouter>
            </div>


        )
    }
}



App.propTypes = {
    classes: PropTypes.object.isRequired,
};


export default withStyles(styles)(App);

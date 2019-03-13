import React, {Component} from 'react';
import './App.css';
import Header from "./components/header";
import {HashRouter} from "react-router-dom";
import {withStyles} from "@material-ui/core";
import PropTypes from "prop-types";
import Login from "./login"


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


    render() {
        if (window.location.href === "http://localhost:3000/#/login") {
            return (
                <HashRouter>
                    <div>
                        <Login/>
                    </div>
                </HashRouter>
            )
        } else {

            return (
                <HashRouter>
                    <div>
                        <Header/>
                    </div>
                </HashRouter>

            )
        }

}
}

App.propTypes = {
    classes: PropTypes.object.isRequired,
};


export default withStyles(styles)(App);

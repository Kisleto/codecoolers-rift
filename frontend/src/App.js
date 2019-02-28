import React, {Component} from 'react';
import './App.css';
import Header from "./components/header";
import {HashRouter} from "react-router-dom";
import {withStyles} from "@material-ui/core";
import PropTypes from "prop-types";

/*  <HashRouter>
                    <div>
                        <SearchField
                            placeholder="Search..."
                            //onChange={onChange}
                            classNames={classes.searchField}
                        />
                        <Route exact path='/info-page' component={InfoPage}/>
                    </div>
                </HashRouter>
                */

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
        const { classes } = this.props;

        return (
                <HashRouter>
                    <div>
                        <Header/>
                    </div>
                </HashRouter>

            )
        }

}

App.propTypes = {
    classes: PropTypes.object.isRequired,
};


export default withStyles(styles)(App);

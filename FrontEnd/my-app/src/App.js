import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import Header from './components/header';
import Panel from './components/panel';
import SearchField from "react-search-field";
import { Route, NavLink, HashRouter } from "react-router-dom";
import InfoPage from './InfoPage';

class App extends Component {
    state = {
        persons: []
    };
    componentDidMount() {
        axios.get(`http://localhost:8080`)
            .then(res => {
                const persons = res.data;
                this.setState({ persons });
            })
    }

    render() {
        if (window.location.href === "http://localhost/#/info-page") {
            return(
            <HashRouter>
                <div>
                    <Route exact path="/info-page" component={InfoPage}/>
                </div>
            </HashRouter>
            )} else {
        return (
            <HashRouter>
            <div>
                <SearchField
                    placeholder="Search..."
                    //onChange={onChange}
                    classNames="test-class"
                />
                <Route exact path='/info-page' component={InfoPage}/>
            </div>
            </HashRouter>

        )}
    }

}

export default App;

import React from 'react';
import {Switch, Route} from 'react-router-dom';
import App from './App';
import InfoPage from './InfoPage';


const Main = () => (
    <main>
        <Switch>
            <Route path="/" component={App}/>
            <Route path="/info-page" component={InfoPage}/>
        </Switch>
    </main>
);

export default Main;
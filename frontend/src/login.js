import React, {Component} from "react";
import {Button, FormControl, FormGroup} from "react-bootstrap";
import "./components/login.css";
import {Link} from "react-router-dom";

export default class Login extends Component {
    constructor(props) {
        super(props);

        this.state = {
            email: "",
            password: ""
        };
    }

    validateForm() {
        return this.state.email.length > 0 && this.state.password.length > 0;
    }

    handleChange = event => {
        this.setState({
            [event.target.id]: event.target.value
        });
    }

    handleSubmit = event => {
        event.preventDefault();
    }

    render() {

        return (
            <div className="Login">
                <form onSubmit={this.handleSubmit}>
                    <FormGroup controlId="email" bsSize="large">
                        <p>Email</p>
                        <FormControl
                            autoFocus
                            type="email"
                            value={this.state.email}
                            onChange={this.handleChange}
                        />
                    </FormGroup>
                    <FormGroup controlId="password" bsSize="large">
                        <p>Password</p>
                        <FormControl
                            value={this.state.password}
                            onChange={this.handleChange}
                            type="password"
                        />
                    </FormGroup>
                    <Link to="/">
                        <Button
                            block
                            bsSize="large"
                            disabled={!this.validateForm()}
                            type="submit"
                        >
                            Login
                        </Button>
                    </Link>
                </form>
            </div>
        );
    }
}
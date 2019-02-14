import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import Button from 'react-bootstrap/Button';
import InputGroup from 'react-bootstrap/InputGroup'
import FormControl from 'react-bootstrap/FormControl'
import Dropdown from 'react-bootstrap/Dropdown'
import DropdownButton from 'react-bootstrap/DropdownButton'

class App extends Component {
    state = {
        query: '',
        results: []
    }
    handleInputChange = () => {
        this.setState({
            query: this.search.value
        })
    }

    getInfo = () => {
        axios.get((`http://localhost:8080/euw1/${this.state.query}`))
            .then(({data}) =>{
                this.setState({
                    results: data.data
                })
                console.log(data)
            })
    }

    render() {
        return (
            <form>
                <InputGroup className="mb-3">
                    <FormControl
                        placeholder="Recipient's username"
                        aria-label="Recipient's username"
                        aria-describedby="basic-addon2"
                        ref={input => this.search = input}
                        onChange={this.handleInputChange}
                    />
                    <InputGroup.Append>
                        <Button
                            variant="outline-secondary"
                            onClick={this.getInfo}
                        >Button</Button>
                    </InputGroup.Append>
                </InputGroup>
            </form>
        )
    }
}

export default App;

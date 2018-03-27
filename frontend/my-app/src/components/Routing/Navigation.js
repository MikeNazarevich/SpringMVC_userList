import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import UsersList from '../UsersList/UsersList';
import CarList from '../CarsList/CarsList';
import './Navigation.css';




const Home = () => (
    <div className="home">
        <h2>Home</h2>
        <UsersList />
    </div>
)

const ChooseCar = () => (
    <div className="car">
        <h2>Cars</h2>
        <CarList />
    </div>
)

const About = () => (
    <div className="home">
        <h2>About</h2>
    </div>
)

class Navigation extends Component {
    render() {
        return(
            <Router>
                <div>
                    <ul className="menu">
                        <li><Link to="/">Home</Link></li>
                        <li><Link to="/cars">Cars</Link></li>
                        <li><Link to="/about" >About</Link></li>
                    </ul>

                    <hr/>

                    <Route exact path="/" component={Home}/>
                    <Route path="/cars" component={ChooseCar}/>
                    <Route path="/about" component={About}/>
                </div>
            </Router>
        )
    }
}

export default Navigation;
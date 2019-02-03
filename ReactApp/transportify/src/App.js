import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route } from 'react-router-dom';

//My custom navigation bar
import NavBar from "./Components/Navbar";

//Main page (home) component
import Home from "./Components/Home";

//Order component
import NewOrder from "./Components/NewOrder";

//OrderList component
import OrderList from "./Components/OrderList";


class App extends Component {
  render() {
    return (
      <BrowserRouter>
      <div className="App">
        <NavBar />
        <Route exact path={"/"} component={Home}></Route>
        <Route exact path={"/NewOrder"} component={NewOrder}></Route>
        <Route exact path={"/OrderList"} component={OrderList}></Route>
      </div>
      </BrowserRouter>
    );
  }
}

export default App;

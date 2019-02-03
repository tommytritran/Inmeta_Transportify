import React, { Component } from 'react';
import { NavLink } from 'react-router-dom';



class NavBar extends Component{
    render(){
        return (
          <nav className="nav-wrapper purple darken-4">
              <div className="container">
                <NavLink to='/' className="waves-effect waves-teal btn-fla"><h2>Transportify</h2></NavLink>
              <ul className="right" >
                <li><NavLink to='NewOrder' className="btn purple accent-4 " style={{ color: 'white' }}>New Order</NavLink></li>
                <li><NavLink to='OrderList' className="btn purple accent-4 " style={{ color: 'white' }}>Order List</NavLink></li>
                <li><NavLink to='/' className="btn purple accent-4 " style={{ color: 'white' }}>Login</NavLink></li>
              </ul>
              </div>

          </nav>
        );
    }
}

export default NavBar;
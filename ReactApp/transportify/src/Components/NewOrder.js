/*
New Order Component, will fetch all current customer and put them into drop down
Add button will pop up modal view to add new customer info
*/

import React, { Component } from 'react';
class NewOrder extends Component{

    constructor(){
        super();
        this.state = {
            customers: []
        };
    }

    componentDidMount(){
        fetch('http://localhost:8080/customers')
            .then(res => res.json())
            .then(json =>{
                this.setState({
                    customers:json
                })
            });
    }

    render(){
        return (
            <div className="container">
            <br></br>
                <div className="form-group">
                    <label><h2>Existing Customers</h2></label>
                    <select className="form-control">
                        {this.state.customers.map(customer => (
                            <option key={customer.customer_id} value={customer.customer_id}>{customer.first_name} {customer.last_name} || email: {customer.email}</option>
                        ))}
                    </select>
                </div>
                <button className="btn-floating btn-large deep-purple accent-2 right"><i className="material-icons">add</i></button>
            </div>
        );
    }
}

export default NewOrder;
/*
New Order Component, will fetch all current customer and put them into drop down
Add button will pop up modal view to add new customer info
*/

import React, { Component } from 'react';

//Loads a dropdown list of all the current customers
import ExistingCustomerList from './NewOrderComponents/ExistingCustomerList';

import OrderDetailForm from './NewOrderComponents/OrderDetailForm';

class NewOrder extends Component{
    constructor(props){
        super(props);
        this.state = {
            isCustomerSelected: false,
            customerSelected:[]
        };
    }


    //Handels input from child components, makes it able to handle which component to show on main order module page
    handler = (customerSelected) =>{
        this.setState({isCustomerSelected:true});
        console.log(customerSelected);
    }


    render(){
        return (
            <div className="container">
                {!this.state.isCustomerSelected &&(
                    //Adds the dropdown list with existing customer and possibility to add new customers, sends in paramterer to dismiss this component
                    <ExistingCustomerList customerSelected = {this.handler}/>
                )}
                {this.state.isCustomerSelected &&(
                    //When customer is set, customer selection view gets dismissed and this component gets loaded, gives a form to input order details
                    <OrderDetailForm />
                )}
            </div>
        );
    }
}

export default NewOrder;
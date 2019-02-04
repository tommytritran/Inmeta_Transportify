import React, { Component } from 'react'
import NewCustomerForm from '../NewOrderComponents/NewCustomerForm';

//Handle all the existing customers and loads a newcustomerform if required to create new customer
export default class ExistingCustomerList extends Component {
    constructor(props){
        super(props);
        this.state = {
            //Array to hold all the existing customer, gets data from API endpoint
            customers: [],
            //Used to toggle the new customer form
            isRequestingNewCustomerForm: false,
            //If employee choose an existing customer, customer object gets loaded into this variable
            selectedCustomer: [],
            //Handles the add/next button; changes icon and color
            btnIcon: 'add',
            btnBGcolor: 'btn-floating btn-large deep-purple accent-2 right'
        };
    }

    //Fetch all the existing customers from API endpoint and fills it into this component state array
    componentDidMount(){
        fetch('http://localhost:8080/customers')
            .then(res => res.json())
            .then(json =>{
                this.setState({
                    customers:json
                })
            });
    }

    //Displays/dismisses customer form
    toggleCustomerForm = () =>{
        this.setState({isRequestingNewCustomerForm: !this.state.isRequestingNewCustomerForm});
        this.setState({btnIcon:'arrow_forward', btnBGcolor:'btn-floating btn-large deep-green accent-2 right', isRequestingNewCustomerForm:true});
    }

    //If employee choose an existing customer, it fetches the form component and sends its customer object and fills up all the rows with the objects data
    fillOutCustomerForm = (e) =>{
        this.state.customers.forEach(element => {
            if(element.customer_id == e.target.value){
                this.setState({
                    selectedCustomer:element,
                    isRequestingNewCustomerForm: true
                });

            }
        });
        this.setState({btnIcon:'arrow_forward', btnBGcolor:'btn-floating btn-large deep-green accent-2 right', isRequestingNewCustomerForm:true});
    }

    //Calls parent handler function and dismisses this component
    confirmCustomerData = () => {
        this.props.customerSelected(this.state.customer);
    }

    handler = () =>{

    }


  render() {
    return (

        
      <div>
         <br></br>
                <div className="form-group">
                    <label><h2>Existing Customers</h2></label>
                    <select className="form-control" onChange={this.fillOutCustomerForm}>
                        {this.state.customers.map(customer => (
                            <option key={customer.customer_id} value={customer.customer_id}>{customer.first_name} {customer.last_name} || email: {customer.email}</option>
                        ))}
                    </select>
                </div>
                <div>
                {this.state.isRequestingNewCustomerForm &&(
                    <NewCustomerForm customer={this.state.selectedCustomer}/>
                )
                }
                </div>
                <button className={this.state.btnBGcolor} onClick={this.confirmCustomerData} ><i className="material-icons">{this.state.btnIcon}</i></button>
      </div>
    )
  }
}

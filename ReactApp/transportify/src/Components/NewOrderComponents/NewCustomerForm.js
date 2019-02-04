import React, { Component } from 'react'

//Handles the customer form for new orders
export default class NewCustomerForm extends Component {

    constructor(props){
        super(props);
        console.log(props);
        this.state = {
            //Gets the customer object from parent if exist
            customer: props.customer
        };
    }

    //Makes it possible for employee to update customer info in case something is wrong with existing customer data
    updateFormField = (event) =>{
        switch (event.target.placeholder){
            case 'First name':
                this.props.customer.first_name = event.target.value;
                this.setState({customer:this.props.customer});
                console.log(this.props.customer.first_name);
                break;
            case 'Last name':
                this.props.customer.last_name = event.target.value;
                this.setState({customer:this.props.customer});
                console.log(this.props.customer.last_name);
                break;
            case 'Phone number':
                this.props.customer.phone_number = event.target.value;
                this.setState({customer:this.props.customer});
                console.log(this.props.customer.phone_number);
                break;
            case 'Email':
                this.props.customer.email = event.target.value;
                this.setState({customer:this.props.customer});
                console.log(this.props.customer.email);
                break;
            default: break;
        }
    }

  render() {
    return (
      <div>
        <form>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="First name" value={this.state.customer.first_name} onChange={this.updateFormField}></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Last name" value={this.state.customer.last_name} onChange={this.updateFormField}></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Phone number" value={this.state.customer.phone_number} onChange={this.updateFormField}></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Email"  value={this.state.customer.email} onChange={this.updateFormField}></input>
            </div>
        </form>
      </div>
    )
  }
}

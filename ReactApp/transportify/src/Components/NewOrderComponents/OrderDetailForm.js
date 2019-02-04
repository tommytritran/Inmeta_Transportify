import React, { Component } from 'react'

export default class OrderDetailForm extends Component {
  render() {
    return (
      <div>
        <form>
        <br></br>
            <label><h2>Order Information</h2></label>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Receiver name" ></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Address from" ></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Address to" ></input>
            </div>
            <div className="form-group">
                <input type="text" className="form-controll" placeholder="Date" ></input>
            </div>
            <div className="form-group">
                <textarea className="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="Comments"></textarea>
            </div>
            <button className="btn-floating btn-large deep-green accent-2 right"><i className="material-icons">arrow_forward</i></button>
        </form>
      </div>
    )
  }
}

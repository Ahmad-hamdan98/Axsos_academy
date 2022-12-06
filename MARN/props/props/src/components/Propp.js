import React, { Component } from 'react'

class Propp extends Component {
  render() {
    return (
      <div>
      <h1>  {this.props.firstname},{this.props.lastname}</h1>
      <p>{this.props.age}</p>
     <p> {this.props.hercolor}</p>
     
      </div>
    )
  }
}
export default Propp;
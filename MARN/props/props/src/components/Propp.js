import React, { Component } from 'react'

class Propp extends Component {
  constructor (props){
    super(props)
    this.state={
      add : this.props.age
    }
  }
  
  render() {
    return (
      <div>
      <h1>  {this.props.firstname},{this.props.lastname}</h1>
      {/* <p>{this.props.age}</p> */}
      <p>{this.state.add}</p>
     <p> {this.props.hercolor}</p>
     <button onClick={ () =>  this.setState({ add:this.state.add+=1 }) } >age + 1</button>
      </div>
    )
  }
}
export default Propp;
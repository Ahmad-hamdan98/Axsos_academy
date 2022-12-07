import React from 'react'


const ghost = (props) => {
  return (
    <div>
        
    <h1>  {props.firstname},{props.lastname}</h1>
    {/* <p>{this.props.age}</p> */}
    <p>{props.age}</p>
   <p> {props.hercolor}</p>
   </div>
  )
}

export default ghost


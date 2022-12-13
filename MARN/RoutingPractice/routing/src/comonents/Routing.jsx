import React from 'react'

const Routing = (props) => {
  return (
    <div> 
      {isNaN(props.input)? <p>the word is : {props.input} </p>:<p>the number is :{props.input}</p>}
    </div>
  )
}

export default Routing
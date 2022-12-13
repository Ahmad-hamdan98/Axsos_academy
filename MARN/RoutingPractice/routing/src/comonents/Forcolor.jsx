import React from 'react'

const Forcolor = (props) => {
  return (
    <div>Forcolor

    <p style={{color:props.color , backgroundColor:props.backcolor}}>the word is :{props.word}</p>

    </div>
  )
}

export default Forcolor
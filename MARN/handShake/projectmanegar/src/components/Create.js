import React from 'react'
import axios from 'axios';
import { useEffect, useState } from 'react';
const Create = (props) => {
  const [name, setName] = useState(props.initialName)
  const [position, setPosition] = useState(props.initialPosition);
  // const [description, setDescription] = useState(props.initialDescription);

  const updatePerson = e => {
    e.preventDefault()
    
    props.onSubmitProp({ name, position ,'states.game1':0 ,'states.game2':0 ,'states.game3':0});
  }
  return (
    <div>
      <form onSubmit={updatePerson}>
      {props.errors.map((err, index) => <p key={index}>{err}</p>)}
              <p>
          <label>Name</label><br />
          <input type="text"
            value={name}
            name="name"
            onChange={(e) => { setName(e.target.value) }} />

        </p>
          
        <p>
          <label>Position</label><br />
          <input type="text"
            name="position"
            value={position}
            onChange={(e) => { setPosition(e.target.value) }} />
        </p>
        <input type="submit" />
      </form>
      <br></br>

    </div>



  )
}

export default Create
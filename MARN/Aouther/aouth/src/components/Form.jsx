import React from 'react'
import axios from 'axios';
import { useEffect,useState } from 'react';
const Form = (props) => {
    const [name ,setName] = useState(props.initialName)


    const updatePerson = e => {
        e.preventDefault()
       
        props.onSubmitProp({name});
    }
  return (
    <div>
        <form onSubmit={updatePerson}>
            {props.errors.map((err, index) => <p key={index}>{err}</p>)}

                <p>
                    <label>Name</label><br />
                    <input type="text"
                        name="name"
                        value={name}
                        onChange={(e) => { setName(e.target.value) }} />
                </p>
            
                
                <input type="submit" />
            </form>
            <br></br>


    </div>
  )
}

export default Form
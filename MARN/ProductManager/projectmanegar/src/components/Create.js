import React from 'react'
import axios from 'axios';
import { useEffect,useState } from 'react';
const Create = (props) => {
  const [title ,setTitle] = useState(props.initialTitle)
  const [price, setPrice] = useState(props.initialPrice);
  const [description, setDescription] = useState(props.initialDescription);

  const updatePerson = e => {
    e.preventDefault()
    // axios.post('http://localhost:8000/api/users/new', {
    //     title,
    //     price,
    //     description
    // })
    //     .then(res=>console.log(res))
    //     .catch(err=>console.log(err))
    props.onSubmitProp({title, price,description});
}
  return (
    <div>
         <form onSubmit={updatePerson}>
                <p>
                    <label>Title</label><br />
                    <input type="text"
                    value={title}
                        name="name"
                        onChange={(e) => { setTitle(e.target.value) }} />
                </p>
                <p>
                    <label>Price</label><br />
                    <input type="text"
                        name="age"
                        value={price}
                        onChange={(e) => { setPrice(e.target.value) }} />
                </p>
                <p>
                    <label>Description</label><br />
                    <input type="text"
                        name="description"
                        value={description}
                        onChange={(e) => { setDescription(e.target.value) }} />
                </p>
                <input type="submit" />
            </form>
            <br></br>
          
        </div>


    
  )
}

export default Create
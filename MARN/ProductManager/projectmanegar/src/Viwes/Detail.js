import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link } from '@reach/router';
import { navigate } from '@reach/router';

    
const Detail = (props) => {
    const [person, setPerson] = useState({})
  
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/users/'+props.id)
            .then(res => setPerson(res.data))
            .catch(err => console.error(err));
    }, []);
    const zxcs =(e)=>{
    axios.delete('http://localhost:8000/api/users/delete/'+ props.id)
            .then(res => {
                // removeFromDom(personId)
            })
            .catch(err => console.error(err));
            navigate("/")
    }

    return (
        <div>
            <p>Title: {person.title}</p>
            <p>Price: {person.price}</p>
            <p>Description: {person.description}</p>
            <button onClick={zxcs} > Delete</button>
        </div>
    )
}
    
export default Detail;


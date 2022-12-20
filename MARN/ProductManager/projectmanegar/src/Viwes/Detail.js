import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
import Delete from '../components/Delete';
    
const Detail = (props) => {
    const [person, setPerson] = useState({})
  
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/users/'+props.id)
            .then(res => setPerson(res.data))
            .catch(err => console.error(err));
    }, []);
    // const zxcs =(e)=>{
    // axios.delete('http://localhost:8000/api/users/delete/'+ props.id)
    //         .then(res => {
    //             // removeFromDom(personId)
    //         })
    //         .catch(err => console.error(err));
    //         navigate("/")
    // }

    return (
        <div>
            <p>Title: {person.title}</p>
            <p>Price: {person.price}</p>
            <p>Description: {person.description}</p>
            {/* <button onClick={zxcs} > Delete</button> */}
            <Delete  personId={person._id} successCallback={()=>navigate('/')} />

        </div>
    )
}
    
export default Detail;


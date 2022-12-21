import React from 'react'
import axios from 'axios'
import { Link } from '@reach/router';
import { useEffect, useState  } from 'react';
import Form from './Form'
import { navigate } from '@reach/router';
const Add = (props) => {

    const [errors, setErrors] = useState([]); 
    // const [aouther, setAouther] = useState('')




    const createAuther = person => {
        axios.post('http://localhost:8000/api/users/new', person)
            .then(res => {
                // setAouther([...aouther, res.data]);
                navigate('/')

            })
            .catch(err=>{
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })            
    
    }
    return (
        <div>
            <br></br>
            <br></br>
            <Form onSubmitProp={createAuther} initialName="" errors={errors}/>
            <Link to={'/'} >Home</Link>


        </div>
    )
}

export default Add
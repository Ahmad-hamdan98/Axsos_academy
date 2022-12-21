import React from 'react'
import axios from 'axios';
import Form from './Form';
import { Link } from '@reach/router';
import { useEffect, useState } from 'react';
import { navigate } from '@reach/router';
const Update = (props) => {
    const [name, setName] = useState(props.name)
    const [errors, setErrors] = useState([]); 

    const [loaded, setLoaded] = useState(false)
    useEffect(() => {
        axios.get('http://localhost:8000/api/users/' + props.id)
            .then(res => {
                setName(res.data.name);

                setLoaded(true)
            })
    }, []);

    const updatePerson = products => {
        axios.put('http://localhost:8000/api/users/update/' + props.id, products)
            .then(res => {navigate('/')}
            )
            .catch(err=>{
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            
    })}
    return (
        <div>
            <br></br>
            <br></br>
            <h1>        Update Form
            </h1>
            <br></br>

            {loaded && <Form onSubmitProp={updatePerson} initialName={name}  errors={errors} />}
            <Link to={'/'} >Home</Link>

        </div>
    )
}

export default Update
import React from 'react'
import { useState } from 'react'
import axios from 'axios'
import { Link } from '@reach/router'
import Create from './Create'
import { navigate } from '@reach/router'
const Add = () => {
    const [products, setProducts] = useState("")
    const [errors, setErrors] = useState([]);
    const createproduct = person => {
        axios.post('http://localhost:8000/api/users/new', person)
            .then(res => {
                setProducts([...products, res.data]);
                navigate('/')
            })
            .catch(err => {
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
            <Link to={'/stats'}>Manege Players</Link>
            <br></br>

            <Link to={'/list'}>List</Link>
            |<Link to={'/add'}>Add Player</Link>
            <br></br>
            <br></br>
            <br></br>

            <Create onSubmitProp={createproduct} initialName="" initialPosition="" errors={errors}/>
              
            

            <Link to={'/'} >Home</Link>
        </div>
    )
}

export default Add
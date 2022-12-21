import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import ProductList from '../components/ProductList';
import Create from '../components/Create';
import { Link } from '@reach/router';
const Main = (props) => {
    const [title, setTitle] = useState('')
    const [price, setPrice] = useState("");
    const [description, setDescription] = useState("");
    const [products, setProducts] = useState("")
    const [loded, setLoded] = useState(false)
    // useEffect(() => {
    // axios.get('http://localhost:8000/api/users/' + id)
    // .then(res => {
    //     setName(res.data.name);
    //     setAge(res.data.age);
    // })
    // }, []);

    

    
   
    return (
        <div>
            Main
            <br></br>
            <Link to={'/stats/1'}>Manege Players</Link>
            <br></br>
            
            <Link to={'/list'}>List</Link>
            |<Link to={'/add'}>Add Player</Link>
            <br></br>
            <br></br>
            <br></br>

           
        </div>
    )
}
export default Main
import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import ProductList from '../components/ProductList';
import Create from '../components/Create';
import { Link } from '@reach/router';
const Show = () => {
    const [products, setProducts] = useState("")
    const [loded, setLoded] = useState(false)
    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => { setProducts(res.data); setLoded(true); })
    },);

    const removeFromDom = personId => {
        setProducts(products.filter(person => person._id != personId));
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

            {loded && < ProductList people={products} deleteProduct={removeFromDom} />}
        </div>
    )
}

export default Show
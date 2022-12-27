import axios from 'axios';
import Tabel from './Tabel';
import React, { useState, useEffect } from 'react'

const Getons = () => {
    const [stat, setStat] = useState()
    const [loaded, setLoded] = useState()
    const [products, setProducts] = useState()
    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => { setProducts(res.data); setLoded(true); })
            console.log("asd")
            
    }, []);


  return (
    <div>
            
        <Tabel loaded={loaded} products={products} />
    </div>
  )
}

export default Getons
import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';

const Main = () => {
const [title ,setTitle] = useState('')
const [price, setPrice] = useState("");
const [description, setDescription] = useState("");
const [products ,setProducts]= useState("")
// useEffect(() => {
// axios.get('http://localhost:8000/api/users/' + id)
// .then(res => {
//     setName(res.data.name);
//     setAge(res.data.age);
// })
// }, []);

useEffect(()=>{
    axios.get("http://localhost:8000/api/users")
        .then(res=>setProducts(res.data))       
}, []);

const updatePerson = e => {
    axios.post('http://localhost:8000/api/users/new', {
        title,
        price,
        description
    })
        .then(res=>console.log(res))
        .catch(err=>console.log(err))
}
    return (
        <div>
            Main
            <form onSubmit={updatePerson}>
                <p>
                    <label>Name</label><br />
                    <input type="text"
                        name="name"
                        onChange={(e) => { setTitle(e.target.value) }} />
                </p>
                <p>
                    <label>Age</label><br />
                    <input type="text"
                        name="age"
                        onChange={(e) => { setPrice(e.target.value) }} />
                </p>
                <p>
                    <label>Description</label><br />
                    <input type="text"
                        name="descripthon"
                        onChange={(e) => { setDescription(e.target.value) }} />
                </p>
                <input type="submit" />
            </form>
            {products}
        </div>
    )
}
export default Main
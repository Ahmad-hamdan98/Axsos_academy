import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import ProductList from '../components/ProductList';
import Create from '../components/Create';
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

    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => { setProducts(res.data); setLoded(true); })
    },);

    const createproduct = person => {
        axios.post('http://localhost:8000/api/users/new', person)
            .then(res => {
                setProducts([...products, res.data]);
            })
    }
    const removeFromDom = personId => {
        setProducts(products.filter(person => person._id != personId));
    }
    return (
        <div>
            Main
            <Create onSubmitProp={createproduct} />

            {loded && < ProductList people={products} deleteProduct={removeFromDom} />}
        </div>
    )
}
export default Main
import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
import Create from '../components/Create';
// import { useParams } from "react-router-dom";
    
const Update = (props) => {
    // const { id } = useParams();
    const [title ,setTitle] = useState(props.title)
    const [price, setPrice] = useState(props.price);
    const [description, setDescription] = useState(props.description);
    const [loaded, setLoaded] = useState(false);
    const [products ,setProducts]= useState("")
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/users/' + props.id)
            .then(res => {
                setTitle(res.data.title);
                setPrice(res.data.price);
                setDescription(res.data.description);
                setLoaded(true)
            })
    }, []);
    
    // const updatePerson = e => {
    //     e.preventDefault();
    //     axios.put('http://localhost:8000/api/users/update/' + props.id, {
    //         title,
    //         price,
    //         description
    //     })
    //         .then(res => navigate('/'))
    //         .catch(err => console.error(err));
    // }

    const updatePerson = products => {
        axios.put('http://localhost:8000/api/users/update/' + props.id, products)
            .then(res => console.log(res),navigate('/'));

    }
    
    return (
        <div>
            <h1>Update a Person</h1>
          {loaded && <Create onSubmitProp={updatePerson}  initialTitle={title} initialPrice={price} initialDescription={description} /> }
        </div>
    )
}
    
export default Update;


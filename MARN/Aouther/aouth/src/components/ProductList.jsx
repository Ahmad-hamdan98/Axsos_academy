import React from 'react'
import axios from 'axios'
import Delete from './Delete';
// import { Link } from '@reach/router'
import { useEffect, useState } from 'react';
import { Link } from '@reach/router';

const ProductList = (props) => {
    const [products, setProducts] = useState([]);
    const [loded, setLoded] = useState(false);

    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => {
                setProducts(res.data);
                setLoded(true)
            })
            .catch(err => console.error(err));
    }, [products]);

    return (
        <div>
            <table border={1}>
                <th>Author</th>
                <th>Actions Avaliable</th>
                {loded && products.map((person, i) =>

                    <tr key={i}>
                        <td>{person.name}</td>
                        <td><Delete personId={person._id} successCallback={() => props.deletePerson(person._id)} />
                        <button  ><Link to={'/edit/'+person._id} >Edit</Link></button>
                        </td>
                        
                    </tr>

                )}
            </table>
        </div>
    )
}

export default ProductList
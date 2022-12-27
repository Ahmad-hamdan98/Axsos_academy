import React, { useState, useEffect } from 'react'
import axios from 'axios'
import { Link } from '@reach/router'
const Tabel = (props) => {
    const [loaded, setLoded] = useState()
    const [products, setProducts] = useState()
    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => { setProducts(res.data); setLoded(true); })
        console.log("asd")

    }, []);
    const pass1 = (id) => {
        axios.put('http://localhost:8000/api/users/update/' + id, { 'stat': 1 })
            .then(res => {
                const objIndex = products.findIndex((obj => obj._id == id));
                const students1 = [...products.slice(0, objIndex), { ...products[objIndex], "stat": 1 }, ...products.slice(objIndex + 1)];
                setProducts(students1);
            }
            );
    }
    const pass2 = (id) => {
        axios.put('http://localhost:8000/api/users/update/' + id, { 'stat': 2 })
            .then(res => {
                const objIndex = products.findIndex((obj => obj._id == id));
                const students1 = [...products.slice(0, objIndex), { ...products[objIndex], "stat": 2 }, ...products.slice(objIndex + 1)];
                setProducts(students1);
            }
            );
    }
    const back2 = (id) => {
        axios.put('http://localhost:8000/api/users/update/' + id, { 'stat': 1 })
            .then(res => {
                const objIndex = products.findIndex((obj => obj._id == id));
                const students1 = [...products.slice(0, objIndex), { ...products[objIndex], "stat": 1 }, ...products.slice(objIndex + 1)];
                setProducts(students1);
            }
            );
    }
    const back1 = (id) => {
        axios.put('http://localhost:8000/api/users/update/' + id, { 'stat': 0 })
            .then(res => {
                const objIndex = products.findIndex((obj => obj._id == id));
                const students1 = [...products.slice(0, objIndex), { ...products[objIndex], "stat": 0 }, ...products.slice(objIndex + 1)];
                setProducts(students1);
            }
            );
    }
    return (
        <div style={{ display: 'flex' }}>

            <table border={1}>
                <th>box1</th>
                {loaded && products.map((person, i) =>

                    person.stat == 0 ?
                        <tr key={i}>

                            <td>
                                <Link to={"/" + person._id} key={i}>{person.name}</Link>
                                <button onClick={() => pass1(person._id)} >Pass</button></td>

                        </tr>
                        : <tr></tr>

                )}
            </table>
            <table border={1}>
                <th>box2</th>
                {loaded && products.map((person, i) =>
                    person.stat == 1 ?
                        <tr key={i}>

                            <td>
                                <button onClick={() => back1(person._id)}>Back</button>
                                {person.stat}
                                <Link to={"/" + person._id} key={i}>{person.name}</Link>

                                <button onClick={() => pass2(person._id)} >Pass</button></td>



                        </tr>
                        : <tr></tr>

                )}
            </table>
            <table border={1}>
                <th>box3</th    >
                {loaded && products.map((person, i) =>
                    person.stat == 2 ?
                        <tr key={i}>

                            <td>
                                <button onClick={() => back2(person._id)}>Back</button>
                                <Link to={"/" + person._id} key={i}>{person.name}</Link>
                            </td>



                        </tr>
                        : <tr></tr>

                )}
            </table>



        </div>
    )
}

export default Tabel

import React from 'react'
import axios from 'axios'
import { Link } from '@reach/router'
import Delete from './Delete'
const ProductList = (props) => {

    // const { removeFromDom } = props;


    // const deletePerson = (personId) => {

    //     axios.delete('http://localhost:8000/api/users/delete/' + personId)
    //         .then(res => {
    //             // removeFromDom(personId)
    //         })
    //         .catch(err => console.error(err));
    // }
    return (
        <div>
            {props.people.map((person, i) =>
                <div key={i}>
                    <Link to={"/" + person._id} key={i}>{person.title}, {person.price},{person.description}</Link>
                    <Link style={{ color: 'red' }} to={"/" + person._id + "/edit"}>
                        Edit
                    </Link>
                    <Delete  personId={person._id} successCallback={()=>props.deletePerson(person._id)}/>
                     
                    <br></br>

                </div>
            )}
        </div>
    )
}

export default ProductList
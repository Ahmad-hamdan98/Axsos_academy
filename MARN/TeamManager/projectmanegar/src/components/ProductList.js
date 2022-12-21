import React from 'react'
import axios from 'axios'
import { Link } from '@reach/router'
import Delete from './Delete'
const ProductList = (props) => {


    return (
        <div>
            <table border={1} style={{ marginLeft: '40%', width: 400 }}>
                <th>Players Names</th>
                <th>Players Positions</th>
                <th>Actions</th>

                {props.people.map((person, i) =>
                    <tr key={i}>
                        <td>
                            {person.name}
                        </td>
                        <td> {person.position}</td>
                        <td>
                            <Delete personId={person._id} successCallback={() => props.deletePerson(person._id)} />
                        </td>
                        <br></br>

                    </tr>

                )}
            </table>
        </div>
    )
}

export default ProductList
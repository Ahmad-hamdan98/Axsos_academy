import React from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
    
export default props => {
    
    // const { personId, successCallback } = props;
    
    const deletePerson = e => {
        let answer = window.confirm("You are sure Delete this player?");
        if (answer)
                { 
                    axios.delete('http://localhost:8000/api/users/delete/' + props.personId)
                    .then(res=>{
                        props.successCallback();
                    })
                }           
       
       
         
    }

    
    
    return (
        <button onClick={deletePerson}>
            Delete
        </button>
    )
}


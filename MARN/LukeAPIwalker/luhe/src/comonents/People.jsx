import React from 'react'
import axios from 'axios';
import { useEffect ,useState } from 'react';
import {navigate} from '@reach/router'
const People = (props) => {
    const [responseData, setResponseData] = useState("");
    useEffect(() => {
    axios.get('https://swapi.dev/api/people/'+props.id)
        .then(response => { setResponseData(response.data) })
        .catch(()=>navigate("/error"))
}, [props.id]);

  return (
    <div>

       <h1> {responseData.name}</h1>
       <p>height :{responseData.height}</p>
       <p>Mass {responseData.mass}</p>
       <p>hair_color :{responseData.hair_color}</p>
       <p>skin_color :{responseData.skin_color}</p>




    </div>
  )
}

export default People
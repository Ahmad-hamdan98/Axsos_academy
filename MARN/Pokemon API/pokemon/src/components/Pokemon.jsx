import React, { useState, useEffect } from 'react'
import axios from 'axios';

const Pokemon = () => {
    const [people, setPeople] = useState([]);
    const [responseData, setResponseData] = useState([]);
    const [fet, setFet] = useState(false)
    useEffect(() => {
        axios.get('https://pokeapi.co/api/v2/pokemon/?limit=809')
            .then(response => { setResponseData(response.data.results) })
    }, []);

    const onclick = () => {
        fet ? setFet(false) : setFet(true)
    }
    return (
        <>
        
                {/* {responseData} */}
            <div>
                <button onClick={onclick}>Fetch Pokemon</button>
                {fet ?
                    responseData.map((r, index) => {
                        return (<div key={index}>{r.name}</div>)
                    }) : ""}
            </div>
        </>
    );
}

export default Pokemon
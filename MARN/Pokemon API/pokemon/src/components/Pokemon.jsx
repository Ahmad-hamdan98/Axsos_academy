import React, { useState, useEffect } from 'react'


const Pokemon = () => {
    const [people, setPeople] = useState([]);
    const [fet, setFet] = useState(false)
    useEffect(() => {
        fetch('https://pokeapi.co/api/v2/pokemon/?limit=807')
            .then(response => response.json())
            .then(response => setPeople(response.results))
    }, []);

    const onclick = () => {
        fet ? setFet(false) : setFet(true)
    }
    return (
        <>
            <div>
            <button onClick={onclick}>Fetch Pokemon</button>

                {fet ?
                people.map((person, index) => {
                    return (<div key={index}>{person.name}</div>)
                }):""}
            </div>
        </>
    );
}

export default Pokemon
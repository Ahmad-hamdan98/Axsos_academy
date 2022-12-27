import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
import Delete from '../components/Delete';

const Detail = (props) => {
    const [person, setPerson] = useState({})
    const [likes, setLikes] = useState(0 )
    const [loaded, setLoaded] = useState(false)


    useEffect(() => {
        axios.get('http://localhost:8000/api/users/' + props.id)
            .then(res => {
                setPerson(res.data)
                setLoaded(true)
                console.log("SAD")
            })
            .catch(err => console.error(err));
    },[]);
    // const zxcs =(e)=>{
    // axios.delete('http://localhost:8000/api/users/delete/'+ props.id)
    //         .then(res => {
    //             // removeFromDom(personId)
    //         })
    //         .catch(err => console.error(err));
    //         navigate("/")
    // }

    const updatePerson = (e) => {

        axios.put('http://localhost:8000/api/users/update/' + props.id,{'like':e+1} )
            .then(res => console.log(res),
            console.log(likes)

            );

    }


    return (
        <div>
            {loaded &&
                <>
                    <p>Name: {person.name}</p>
                    <p>Type: {person.type}</p>
                    <p>Description: {person.desc}</p>
                <hr></hr>
                    Skills:

                        <p>Skill_1:{person.states.skill1}</p>
                        <p>  Skill_2:{person.states.skill2}</p>
                        <p> Skill_3:{person.states.skill3}</p>
                   
                <hr></hr>
                    <p>Likes:{person.like}</p>
                    <button onClick={()=>updatePerson(person.like)} > Like</button>
                    <Delete personId={person._id} successCallback={() => navigate('/')} /></>}

        </div>

    )
}

export default Detail;


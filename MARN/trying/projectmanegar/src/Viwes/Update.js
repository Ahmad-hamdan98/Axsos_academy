import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
import Create from '../components/Create';
// import { useParams } from "react-router-dom";

const Update = (props) => {
    // const { id } = useParams();
    const [pet, setPet]=useState()
    const [errors, setErrors] = useState([]);

    const [name, setName] = useState(props.name)
    const [type, setType] = useState(props.type);
    const [desc, setDesc] = useState(props.desc);
    const [loaded, setLoaded] = useState(false);
    const [products, setProducts] = useState("")
    const [skill1, setSkill1] = useState(props.skill1)
    const [skill2, setSkill2] = useState(props.skill2)
    const [skill3, setSkill3] = useState(props.skill3)

    useEffect(() => {
        axios.get('http://localhost:8000/api/users/' + props.id)
            .then(res => {
                setPet(res.data)
                // setName(res.data.name);
                // setType(res.data.type);
                // setDesc(res.data.desc);
                // setSkill1(res.data.skill1)
                // setSkill2(res.data.skill2)
                // setSkill3(res.data.skill3)
                setLoaded(true)
            })
    },);

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
            .then(res => console.log(res), navigate('/'));

    }

    return (
        <div>
            <h1>Update a Person</h1>
            {loaded && <Create onSubmitProp={updatePerson} initialName={pet.name} initialType={pet.type}
                initialDesc={pet.desc} initialSkill1={pet.states.skill1} initialSkill2={pet.states.skill2} initialSkill3={pet.states.skill3}
                errors={errors}
            />}
        </div>
    )
}

export default Update;


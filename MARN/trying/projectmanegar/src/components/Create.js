import React from 'react'
import axios from 'axios';
import { useEffect, useState } from 'react';
const Create = (props) => {
  const [name, setName] = useState(props.initialName)
  const [type, setType] = useState(props.initialType)
  const [desc, setDesc] = useState(props.initialDesc)

  const [skill1, setSkill1] = useState(props.initialSkill1)
  const [skill2, setSkill2] = useState(props.initialSkill2)
  const [skill3, setSkill3] = useState(props.initialSkill3)


  const updatePerson = e => {
    e.preventDefault()
    
    props.onSubmitProp({ name, type ,desc,'states.skill1':skill1 ,'states.skill2':skill2 ,'states.skill3':skill3});
  }
  return (
    <div>
      <form onSubmit={updatePerson}>
      {props.errors.map((err, index) => <p key={index}>{err}</p>)}
              <p>
          <label>Name</label><br />
          <input type="text"
            value={name}
            name="name"
            onChange={(e) => { setName(e.target.value) }} />

        </p>
          
        <p>
          <label>Type</label><br />
          <input type="text"
            name="type"
            value={type}
            onChange={(e) => { setType(e.target.value) }} />
        </p>
        <p>
          <label>Description</label><br />
          <input type="text"
            name="desc"
            value={desc}
            onChange={(e) => { setDesc(e.target.value) }} />
        </p>
        <hr></hr>
        <p>
          <label>Skill1</label><br />
          <input type="text"
            name="skill1"
            value={skill1}
            onChange={(e) => { setSkill1(e.target.value) }} />
        </p>
        <p>
          <label>Skill2</label><br />
          <input type="text"
            name="skill2"
            value={skill2}
            onChange={(e) => { setSkill2(e.target.value) }} />
        </p>
        <p>
          <label>Skill3</label><br />
          <input type="text"
            name="skill3"
            value={skill3}
            onChange={(e) => { setSkill3(e.target.value) }} />
        </p>
        
        <input type="submit" />
      </form>
      <br></br>

    </div>



  )
}

export default Create
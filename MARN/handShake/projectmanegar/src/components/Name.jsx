import React from 'react'
import { useState } from 'react'
const Name = (props) => {
    const [name,setName]=useState("")
    const sum = (e) => {
        e.preventDefault()
        props.name1(name)
    }
  return (
    <div>
        <form onSubmit={sum}>
                inter name: <input type="text" onChange={(e)=>setName(e.target.value)}  />
                <input type="submit" value="sent"/>
</form>

 

    </div>
  )
}

export default Name
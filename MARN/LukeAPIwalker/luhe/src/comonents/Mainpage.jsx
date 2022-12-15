import React from 'react'
import { useEffect ,useState } from 'react';
import {Router,navigate } from '@reach/router'
const Mainpage = () => {

    const [ins ,setIns]=useState("");
    const type=['People','Planets']
const [id,setId]=useState()
    const [selectedFruit, setSelectedFruit] = useState(type[0]);

const handleSubmit=(e)=>{

if(selectedFruit==='People'){
    navigate('/People/'+id)
}else {
    navigate('/Planets/'+id)

}

}
    
  return (
    <div>Choose 

            <form onSubmit={handleSubmit}>
            <select value={selectedFruit} onChange={e => setSelectedFruit(e.target.value) }>
                {type.map( (fruit, idx) => 
                    <option key={idx} value={fruit}>{fruit}</option>
                )}
            </select>
            <input type='number' onChange={(e)=>setId(e.target.value)} />
            <button>Take a bite!</button>
            </form>
    <Router>

    </Router>

    </div>
  )
}

export default Mainpage
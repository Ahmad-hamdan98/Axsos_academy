import React , { useEffect, useState } from 'react';
import ProductList from './ProductList';

import axios from 'axios'
import { Link } from '@reach/router'
import Delete from './Delete'

const States = (props) => {
    const [color,setColor] = useState('')
    const [products, setProducts] = useState("")
    const [loded, setLoded] = useState(false)



    const color1 =(n,id)=>{
        // e.states.game1=1
        axios.put("http://localhost:8000/api/users/update/"+id ,props.num==1?{"states.game1":n}:props.num==2?{"states.game2":n}:{"states.game3":n})

        .then(res=>console.log(res))
    }

    useEffect(() => {
        axios.get("http://localhost:8000/api/users")
            .then(res => { setProducts(res.data); setLoded(true);  })
    },);
  return (


    <div>
        States for Game {props.num}
        <br></br>
        <br></br>
        <br></br>
        <Link to={'/stats/1'}>Game1</Link>|
        <Link to={'/stats/2'}>Game2</Link>|
        <Link to={'/stats/3'}>Game3</Link>

        <br></br>
        <br></br>
        <br></br>

<table border={1}  style={{marginLeft:'40%' , width:400}}>
    <th>Players</th>
    <th>Actions</th>

            {loded && products.map((person, i) => 
                <tr key={i}>
                    
                  <td>
                    <Link to={"/" + person._id} key={i}>{person.name}</Link>
                  </td>
                  <td>{person.states.game1}</td>
                  <td>
                    {props.num==1?
                    <>
                 <button onClick={()=>color1(1,person._id)} style={{backgroundColor:person.states.game1==1?"green":''}}>Playing</button>
                 <button onClick={()=>color1(-1,person._id)} style={{backgroundColor:person.states.game1==-1?"red":''}}>Not playing</button>
                 <button onClick={()=>color1(0,person._id)} style={{backgroundColor:person.states.game1==0?"yellow":''}}>Undecided</button>
                 </>
                      :
                      props.num==2?
                      <>
                 <button onClick={()=>color1(1,person._id)} style={{backgroundColor:person.states.game2==1?"green":''}}>Playing</button>
                 <button onClick={()=>color1(-1,person._id)} style={{backgroundColor:person.states.game2==-1?"red":''}}>Not playing</button>
                 <button onClick={()=>color1(0,person._id)} style={{backgroundColor:person.states.game2==0?"yellow":''}}>Undecided</button>
                 </>
                 :
                 <>
                 <button onClick={()=>color1(1,person._id)} style={{backgroundColor:person.states.game3==1?"green":''}}>Playing</button>
                 <button onClick={()=>color1(-1,person._id)} style={{backgroundColor:person.states.game3==-1?"red":''}}>Not playing</button>
                 <button onClick={()=>color1(0,person._id)} style={{backgroundColor:person.states.game3==0?"yellow":''}}>Undecided</button>
                 </>}</td>
                     
                    <br></br>

                </tr>
                
            )}
             </table> 
             <Link to={'/'}>Home</Link>
    </div>
  )
}

export default States
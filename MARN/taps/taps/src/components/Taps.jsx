import React,{useState} from 'react'


const Taps = (props) => {
    const [message ,setMessage]= useState("Welcome!")
    // const [listof ,setListof] =useState([{"item":"","content":}])
    const [index,setIndex]=useState(0)
    const [mouse , setMouse]=useState(false)
    
    const onmouse=(e)=>{
        e.target.style.background="black"
        e.target.style.color="white"
        
    }
    const offmouse=(e)=>{
        e.target.style.background="white"
        e.target.style.color="black"
    }
const onClickhandler =(e,value)=>{
    setIndex(value)
    
}
const st=
    {
        marginTop:'100px',
        width:"200px",
        height:"40px",
        fontSize:'30px',
        background: mouse? "lightblue":"purple"
    };
    const r={
        border:"1px solid black",
        fontSize:'30px',
        width:"600px",
        height:"200px",
        marginLeft:'467px'
    }
  return (
    <div>
{
    props.listof.map((item,index)=>{
    return(
        <button style={st} onClick={(e)=>onClickhandler(e,index)} onMouseOver={onmouse} onMouseOut={offmouse}>{item.name} </button>
    )
    })
}
<div><p style={r}>{props.listof[index].content}</p></div>






        <hr></hr>
        {/* <hr></hr>
        
        <div style={{display:'flex'}}>
    <button onClick={tap1}>Tap1</button>
    <button >Tap2</button>
    <button>Tap3</button> 
     </div>
        <hr></hr>
        <hr></hr>
       
<tap onClick={()=>tap1} style={{border:'1px solid black', Width:'400px', heigth:'324' }} >Tap1</tap>
<tap style={{border:'1px solid black' }} onClick={tap2}>Tap2</tap>
<tap style={{border:'1px solid black' }}>Tap3</tap>
<br></br>
    <textarea name="area" id="t" cols="30" rows="10">{message}</textarea> */}

    </div>
  )
}

export default Taps
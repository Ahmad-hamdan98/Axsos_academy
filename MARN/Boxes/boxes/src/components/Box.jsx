import React, { useState } from 'react'

const Box = () => {
    const [box, setBox] = useState("")
    const [width, setWidth] = useState(0)
    const [boxes, setBoxes] = useState([{"color":"red","width":0,"height":0}])

    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);


    const add = (e) => {
        setBox(e.target.value)
    }
    const addd = (e) => {
        setWidth(e.target.value)
    }
    const added = (e) => {
        e.preventDefault();
        setBoxes(boxes => [...boxes, {"color":box,"width":width+"px" ,"height":width+"px"}])
        setHasBeenSubmitted(true);
    }
    const deletee = (e)=>{
    
       
        setBoxes(boxes=>boxes.filter(boxes=> boxes !==e))
    }

    return (
        <>
            <form onSubmit={added}>
                {

                    hasBeenSubmitted ?
                        <h3>keep intering colors</h3> :
                        <h3>you haven't enter any coler</h3>
                }

                <div>
                    <label>Color </label>
                    <input type="text" onChange={add} />

                </div>
                <div>
                    <label>Width </label>
                    <input type="text" onChange={addd} />

                </div>

                <input type="submit" value="Add Box" />
            </form>
            {/* <div style={{ backgroundColor: box, width: 100, height: 100 }} >{box}</div> */}
<br></br>
            <div style={{ display: "flex" ,justifyContent:"space-around"}}>
                {boxes.map((item, i) =>
                    <div>
                        <button onClick={()=>deletee(item)}>X</button>
                        <div style={{ backgroundColor: item.color, width: item.width, height: item.width }}>{item.color} {i}</div>
                    </div>)}
            </div>

        </>
    )
}

export default Box
import React, { useState } from 'react'

const Todo = () => {
    const [todo, setTodo] = useState("")
    const [isCompleted, setIsCompleted] = useState(false);
    const [todos, setTodos] = useState([{ todo, isCompleted ,"style":''}])
    // const [todos, setTodos] = useState([])


    const handleChange=(e,item)=> {
        setIsCompleted(e.target.checked);
        item.isCompleted=e.target.checked
        item.isCompleted? item.style='line-through' :item.style=''

    }
    const add = (e) => {
        e.preventDefault();
        setTodo(e.target.value)
    }
    const added = (e) => {
        e.preventDefault();
        setTodos([...todos, { "name": todo, isCompleted:false ,style:''}])
        console.log(todo)
        console.log(todo.checked)
        setTodo("")
    }
    const deletee = (e) => {
        setTodos(todos => todos.filter(i => i !== e))
    }

    //     const stylee={backgroundColor: 'lightgrey', width: '400px', marginLeft: '40%',fontSize:'15px' ,
    //     textDecoration: isCompleted ? 'line-through' : '',display:'flex',justifyContent:'space-between'
    // }
    return (
        <div>Todo

            <form onSubmit={added}>
                <div>
                    <label>Add todo </label>
                    <input type="text" onChange={add} value={todo} />
                </div>
                <input type="submit" value="Add" />
            </form>
            {/* //--------------------------------------------------------------- */}


            <div style={{marginLeft: '40%'}} >
                {todos.map((item, i) =>
                    <div key={i} style={{
                        backgroundColor: 'lightgrey', width: '400px', margin:'1%', fontSize: '8px',
                         display: 'flex', justifyContent: 'space-between' 
                    }}>
                        <input type="checkbox" checked={item.isCompleted}
                            onChange={e=>{handleChange(e,item)}} />
                        <h1 style={{textDecoration:item.style}}> {item.name} {item.checked} </h1><button onClick={() => deletee(item)}>delete</button>
                    </div>
                    )
                    
                }
                <hr></hr>
                        
            </div>

            {/* //--------------------------------------------------------------- */}
        </div>

    )
}

export default Todo
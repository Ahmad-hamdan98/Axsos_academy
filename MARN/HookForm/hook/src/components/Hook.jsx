import React, { useState } from  'react';
    
    
const UserForm = (props) => {
    const [username, setUsername] = useState("");
    const [lastname, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");  
    const [ConfermPassword, setConfermPassword] = useState("");  
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { username, email, password ,ConfermPassword };
        console.log("Welcome", newUser);
    };
    
    return(
    <>
        <form onSubmit={ createUser }>
            <div>
                <label>Firstname: </label> 
                <input type="text" onChange={ (e) => setUsername(e.target.value) } />
            </div>
            <div>
                <label>Lasttname: </label> 
                <input type="text" onChange={ (e) => setLastname(e.target.value) } />
            </div>
            <div>
                <label>Email Address: </label> 
                <input type="text" onChange={ (e) => setEmail(e.target.value) } />
            </div>
            <div>
                <label>Password: </label>
                <input type="password" onChange={ (e) => setPassword(e.target.value) } />
            </div>
            <div>
                <label>ConfermPassword: </label>
                <input type="password" onChange={ (e) => setConfermPassword(e.target.value) } />
            </div>
            <input type="submit" value="Create User" />
        </form>
<hr></hr>
<h1>Your Data here</h1>
<h4>your name :{username}</h4>
<h4>your name :{lastname}</h4>
<h4>your Email :{email}</h4>
<h4>your password:{password}</h4>
<h4>your Conferm password:{ConfermPassword}</h4>

</>
    );
};
    
export default UserForm;

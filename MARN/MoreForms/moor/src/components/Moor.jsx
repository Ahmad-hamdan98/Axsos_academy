import React, { useState } from 'react'

const Moor = () => {

    const [username, setUsername] = useState("");
    const [usernamError, setUserError] = useState("");

    const [lastname, setLastname] = useState("");
    const [lastnamError, setLastError] = useState("");
    const [email, setEmail] = useState("");
    const [lastemailError, setEmailError] = useState("");

    const [password, setPassword] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [ConfermPassword, setConfermPassword] = useState("");
    const [confermError, setConfermError] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);


    const createUser = (e) => {
        e.preventDefault();
        const newUser = { username, email, password };
        console.log("Welcome", newUser);
        setHasBeenSubmitted(true);
    };

    // const formMessage = () => {
    //     if( hasBeenSubmitted ) {
    //     return "Thank you for submitting the form!";
    // } else {
    //     return "Welcome, please submit the form";
    // }
    // };
    const handleUserName = (e) => {
        setUsername(e.target.value);
        if (e.target.value == "") {
            setUserError("");
        }
        else {
            if (e.target.value.length < 1) {
                setUserError("User is required!");
            } else if (e.target.value.length < 3) {
                setUserError("User must be 3 characters or longer!");
            } else {
                setUserError("");
            }
        }
    }
    const handleLastName = (e) => {
        setUsername(e.target.value);
        if (e.target.value == "") {
            setLastError("");
        } else {
            if (e.target.value.length < 1) {
                setLastError("User is required!");
            } else if (e.target.value.length < 3) {
                setLastError("User must be 3 characters or longer!");
            } else {
                setLastError("");
            }
        }
    }
    const handlemailName = (e) => {
        setUsername(e.target.value);
        if (e.target.value == "") {
            setEmailError("");
        } else {
            if (e.target.value.length < 1) {
                setEmailError("User is required!");
            } else if (e.target.value.length < 3) {
                setEmailError("User must be 3 characters or longer!");
            } else {
                setEmailError("");
            }
        }
    }
    const handconfermName = (e) => {
        setConfermPassword(e.target.value);
        if (e.target.value == "") {
            setConfermError("");
        }else{
        if (e.target.value !== password) {
            setConfermError("conferm must be == password");
        } else if (e.target.value.length < 3) {
            setConfermError("conferm dsfsdgvsdvz");
        } else {
            setConfermError("");
        }}
    }
    const handpasswordName = (e) => {
        setPassword(e.target.value);
        if (e.target.value == "") {
            setPasswordError("");
        }else{
        if (e.target.value.length < 1) {
            setPasswordError("User is required!");
        } else if (e.target.value.length < 3) {
            setPasswordError("User must be 3 characters or longer!");
        } else {
            setPasswordError("");
        }
    }}
    return (
        <>
            <form onSubmit={createUser}>
                {
                    hasBeenSubmitted ?
                        <h3>Thank you for submitting the form!</h3> :
                        <h3>Welcome, please submit the form.</h3>
                }
                <div>
                    <label>Firstname: </label>
                    <input type="text" onChange={handleUserName} />
                    {
                        usernamError ?
                            <p style={{ color: 'red' }}>{usernamError}</p> : ''
                    }
                </div>

                <div>
                    <label>Lasttname: </label>
                    <input type="text" onChange={handleLastName} />
                    {
                        lastnamError ?
                            <p style={{ color: 'red' }}>{lastnamError}</p> : ''
                    }
                </div>
                <div>
                    <label>Email Address: </label>
                    <input type="text" onChange={handlemailName} />
                    {
                        lastemailError ?
                            <p style={{ color: 'red' }}>{lastemailError}</p> : ''
                    }

                </div>
                <div>
                    <label>Password: </label>
                    <input type="password" onChange={handpasswordName} />
                    {
                        passwordError ?
                            <p style={{ color: 'red' }}>{passwordError}</p> : ''
                    }
                </div>
                <div>
                    <label>ConfermPassword: </label>
                    <input type="password" onChange={handconfermName} />
                    {
                        confermError ?
                            <p style={{ color: 'red' }}>{confermError}</p> : ''
                    }
                </div>
                <input type="submit" value="Create User" />
            </form>
            <hr></hr>

        </>
    );
}



export default Moor
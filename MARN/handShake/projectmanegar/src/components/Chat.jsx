import React from 'react'
import io from 'socket.io-client';
import { useEffect, useState } from 'react';
const Chat = (props) => {
    const [socket] = useState(() => io(':8000'));
    const [message, setMessage] = useState("")
    const [messages, setMessages] = useState([])
    useEffect(() => {

        console.log('Is this running?');
        socket.on('chat', data => setMessages([...messages, data]));

        // return () => socket.disconnect(true);
    },);

    const hand = (e) => {
        e.preventDefault();

        socket.emit("chat", props.name4 + " Sends :" + message)


    }


    return (
        <div>Chat

            <div style={{height:200 , overflow:"auto",width:400,marginLeft:"40%"}}>
            {messages.map((msg, i) =>
                    <p style={{ backgroundColor: "yellow", width: 200 ,borderRadius:"13%"}} key={i}>{msg}</p>
                    )}
                    </div>


            <form onSubmit={hand} >

                <> message <input type="text" onChange={(e) => setMessage(e.target.value)} value={message} /></>




                <input type="submit" value="send" />
            </form>


        </div>
    )
}

export default Chat
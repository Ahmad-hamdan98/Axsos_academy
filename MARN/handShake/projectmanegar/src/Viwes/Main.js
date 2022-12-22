import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import ProductList from '../components/ProductList';
import Create from '../components/Create';
import { Link } from '@reach/router';
import Name from '../components/Name';
import Chat from '../components/Chat';
const Main = (props) => {
    const [name, setName] = useState('')
   

    return (
        <div>
            {name?
            <Chat name4={name}/>
            :<Name name1={setName}/>
        }
        </div>
    )
}
export default Main
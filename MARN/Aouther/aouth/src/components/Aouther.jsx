import { Link } from '@reach/router'
import React from 'react'
import Text from './Text'
import axios from 'axios'
import ProductList from './ProductList'
import { useEffect,useState } from 'react';
const Aouther = () => {
    
  return (
    <div>
        <Text/>
        <Link to={"/add"} >Add Aouther</Link>
        <br></br>
        <br></br>
        We Have quets by:
         < ProductList  />
        
    </div>
  )
}

export default Aouther
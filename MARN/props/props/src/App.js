// import logo from './logo.svg';
import React from 'react'
import './App.css';
import Propp from './components/Propp';

function App() {
  return (
    <div className="App">
    <Propp firstname={"Ra'd"}  lastname={"asdasd"} age={32} hercolor={"red"}/> 
    <Propp firstname={"lith"}  lastname={"sfv"} age={256} hercolor={"green"}/> 
    <Propp firstname={"assadda"}  lastname={"dsfs"} age={42} hercolor={"red"}/> 
    <Propp firstname={"asdasda"}  lastname={"gged"} age={3} hercolor={"blue"}/> 
   
    </div>
  );
}

export default App;

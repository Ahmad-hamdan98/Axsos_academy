// import logo from './logo.svg';
import './App.css';
// import React from 'react'
// import Header from './Components/Header';
// import Navigation from './Components/Navigation';
// import Main from './Components/Main';
// import SubContents from './Components/SubContents';
// import Advertisement from './Components/Advertisement';
 
import React, { Component } from 'react'




function App() {  
  return (
    <div className="App">
      
      <div className='container'>
      <div className='header'></div>
      <div className='stepfather' >
      <div className='navigations'>

      </div>
      <div className='rbmain'>
      <div className='main'>
        <div className='box1'></div>
        <div className='box1'></div>
        <div className='box1'></div>
      </div>
      <div className='thtmain'></div>
      </div>
    </div>
    </div>
   
    </div>
  );
}

export default App;


// class TodoApp extends React.Component {
//   constructor(props) {
//   super(props)
//   this.state = {
//       items: [
//       { text: ["Learn JavaScript"] },
//       { text: ["Learn react"] },
//       { text: ["Learn node"]},
//       { text: ["Learn vue"] }
//     ]
//   }
//   }
  
  // render() {
  // return (
  //   <div>
  //     <h2>Todos:</h2>
  //     <ol>
  //     {this.state.items.map(item => (
  //       <li key={item.id}>
  //           <span>{item.text}</span>
  //       </li>
  //     ))}
  //     </ol>
  //   </div>
  // )
  // }
  // }
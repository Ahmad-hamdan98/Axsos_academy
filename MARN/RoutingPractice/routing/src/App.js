import logo from './logo.svg';
import './App.css';
import { Router } from '@reach/router'
import Routing from './comonents/Routing';
import Home from './comonents/Home';
import Forcolor from './comonents/Forcolor';
function App() {
  return (
    <div className="App">
      <Router>
        <Home path="/home" />
        <Forcolor path="/:word/:color/:backcolor" />
        <Routing path="/:input" />
      </Router>
    </div>
  );
}

export default App;

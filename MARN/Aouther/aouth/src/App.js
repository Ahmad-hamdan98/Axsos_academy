
import './App.css';
import Aouther from './components/Aouther';
import Add from './components/Add';
import Update from './components/Update';
import { Router } from '@reach/router';
function App() {
  return (
    <div className="App">
      
      <Router>
        
        <Aouther path="/" />
        <Add path='/add' />
        <Update path="/edit/:id"/>
      </Router>
    </div>
  );
}

export default App;

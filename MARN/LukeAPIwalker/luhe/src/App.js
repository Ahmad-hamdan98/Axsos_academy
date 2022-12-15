import './App.css';
import { Router } from '@reach/router'
import Mainpage from './comonents/Mainpage';
import People from './comonents/People';
import Planets from './comonents/Planets';
import Error from './comonents/Error';
function App() {
  return (
    <div className="App">
      <Mainpage />
      <Router>
        <Error path="/error" />
        <People path="/People/:id" />
        <Planets path="/Planets/:id" />
      </Router>
    </div>
  );
}

export default App;

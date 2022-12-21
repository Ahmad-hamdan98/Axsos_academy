import './App.css';
import Main from './Viwes/Main';
import { Router } from '@reach/router';
import Detail from './Viwes/Detail';
import Update from './Viwes/Update';
import States from './components/States';
import Add from './components/Add';
import Show from './components/Show';
import Create from './components/Create';
function App() {
  return (
    <div className="App">

      <Router>
        <Main path="/" />
        <Add path="/add"/>
        <Show path='/list'/>
        <States path="/stats/:num"/>
        <Detail path="/:id" />
        <Update path="/:id/edit" />
      </Router>
    </div>
  );
}

export default App;

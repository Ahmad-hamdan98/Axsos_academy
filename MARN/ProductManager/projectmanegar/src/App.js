import './App.css';
import Main from './Viwes/Main';
import { Router } from '@reach/router';
import Detail from './Viwes/Detail';
import Update from './Viwes/Update';
function App() {
  return (
    <div className="App">

      <Router>
        <Main path="/" />
        <Detail path="/:id" />
        <Update path="/:id/edit" />
      </Router>
    </div>
  );
}

export default App;

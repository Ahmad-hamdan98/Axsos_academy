import Taps from './components/Taps';
import './App.css';

function App() {
  return (
    <div className="App">
      <Taps listof={[
        {name:"tap1",content:"tap 1 content"},
        {name:"tap2",content:"tap 2 content"},
        {name:"tap3",content:"tap 3 content"}
        ]}/>
    </div>
  );
}

export default App;

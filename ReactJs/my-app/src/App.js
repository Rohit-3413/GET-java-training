import logo from './logo.svg';
import './App.css';
import Main from './components/Main';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1> Welcome to Coforge</h1>
      </header>
        <section className="Main">
        {/* Render Main Component */}
         <Main></Main>
      </section>
    </div>
  );
}

export default App;

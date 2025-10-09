import logo from './logo.svg';
import './App.css';
import Main from './components/Main';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Hello World - Welcome to Coforge</h1>
      </header>
        <section className="Main">
        
         <Main></Main>    {/* Render Main Component */}
      </section>
      <footer className='footer'>
        <Footer></Footer>   {/* Render Footer Component */}
      </footer>
    </div>
  );
}

export default App;

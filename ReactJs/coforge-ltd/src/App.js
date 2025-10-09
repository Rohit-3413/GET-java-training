import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router';
import './components/Footer';
import Footer from './components/Footer';
import { Navbar } from './components/Navbar';
import Main from './components/Main';
import JSXDemo from './components/JSXDemo';
import Profile from './components/Profile';
import PropsDemo from './components/PropsDemo';
import { StateDemo } from './components/StateDemo';
import { Addition } from './components/Addition';
import { Login } from './components/Login';
import { HooksDemo } from './components/HooksDemo';
import ListDemo from './components/ListDemo';
import SurveyForm from './components/SurveyForm';

function App() {
  return (
    <div>

    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Welcome to Coforge Limited</h1>
      </header>
   </div>

    <section>
    <div className='Main'>
     <Router>
      <Navbar></Navbar>
      <Routes>
        <Route path='/' element={<Main/>} />
        <Route path='jsx1' element={<JSXDemo/>} />
        <Route path='/profile' element={<Profile/>} />
        <Route path='/props' element={<PropsDemo/>} />
        <Route path='/abc' element={<StateDemo/>} />
        <Route path='/addNum' element={<Addition/>} />
        <Route path='/login' element={<Login/>} />
        <Route path='/hooks' element={<HooksDemo/>} />
        <Route path='/survey' element={<SurveyForm/>} />
        
      </Routes>
     </Router>
    </div>
    </section>

    <div id="footer">
     <Footer></Footer>
    </div>

   </div>    
  );
}

export default App;
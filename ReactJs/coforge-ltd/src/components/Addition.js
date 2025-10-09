import React, {useEffect, useState} from 'react'
import '../styles/Addition.css'

export const Addition = () => {

 //Define & Initialise State using useState() Hook -ush
    const [num1 , setNum1] = useState();
    const [num2, setNum2] = useState();
    const [result, setResult] = useState();
    const [error, setError] = useState(false);
    const [message, setMessage] = useState(''); // String errorText='';

    //Functional Component Lifecycle method implimentation -useEffect() - ueh
    //Executed when component is initialised
    useEffect(() => {
           myMessage(); 
    }, []);

    //nfn- shortcut to create constant arrow function
    const myMessage = () => { 
        setMessage('React Hooks- Future of ReactJs');
     }

     const myAddition = () => { 
        const number1 = parseFloat(num1);
        const number2 = parseFloat(num2);
    
        if (isNaN(number1) || isNaN(number2)) {
          setError('Please enter valid numbers');
          setResult(null);
        } else {
          setError('');
          setResult(number1 + number2);
        }
      }

  return (
   <div className="container">
    <h2>Add Two Numbers - Functional Component - using useState() & useEffect() React Hooks</h2>
    <h3>{message}</h3>
    <hr />
    <form className="form">
      <label>Enter First Number:</label>
      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
        className="input-field"
      />
      <label>Enter Second Number:</label>
      <input
        type="number"
        value={num2}
        onChange={(e) => setNum2(e.target.value)}
        className="input-field"
      />
      <button type="button" onClick={myAddition} className="add-button">
        Add
      </button>
      {error && <p className="error">{error}</p>}
      {result !== null && <p className="result">Result: {result}</p>}
    </form>
  </div>
  )
}

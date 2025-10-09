import React, {useEffect, useState} from 'react'  //irh
import '../styles/Login.css'

//rafc - Arrow Function Component
export const Login = () => {

    //define state using useState Hook -ush
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState('');
    const [info, setInfo] = useState('');

    //ueh
    useEffect(() => {
        setInfo('Coforge Technologies - Login Form')
    }, []);

    //nfn - create named arrow function
    const handleLogin = (e) => { 
         e.preventDefault(); //prevents component to rerender

        // Dummy login check
        if (username === 'admin' && password === '1234') {
        setMessage('✅ Login Successful!');
        } else {
        setMessage('❌ Invalid username or password.');
        }
     }

  return (
    <div className="login-container">
      <h2>{info}</h2>
      <form onSubmit={handleLogin}>
        <input
          type="text"
          placeholder="Enter username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
          required
        />
        <input
          type="password"
          placeholder="Enter password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button type="submit">Login</button>
      </form>
      {message && <p className="message">{message}</p>}
    </div>
  )
}

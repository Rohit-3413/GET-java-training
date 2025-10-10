import React from 'react'
import {Link} from 'react-router-dom'

import '../styles/Navbar.css'

export const Navbar = () => {
  return (
     <div>
        <nav className="navbar">
            <ul className="nav-list">
                <li className="nav-item">
                     <Link to="/" className="nav-link">Home</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="jsx1" className="nav-link">JSX</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/profile" className="nav-link">Profile</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/props" className="nav-link">Props</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/abc" className="nav-link">StateDemo</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/addNum" className="nav-link">Addition</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/login" className="nav-link">Login</Link> {/* <a href='/'> */}         
                </li>
                 <li className="nav-item">
                     <Link to="/hooks" className="nav-link">React Hooks</Link> {/* <a href='/'> */}         
                </li>
                 <li className="nav-item">
                     <Link to="/list" className="nav-link">List Demo</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/survey" className="nav-link">Survey</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/rest1" className="nav-link">REST API</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/customers" className="nav-link">Add Customer</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/display" className="nav-link">Customers RESTAPI</Link> {/* <a href='/'> */}         
                </li>
                
            </ul>
        </nav>
        
 </div>       
  )
}

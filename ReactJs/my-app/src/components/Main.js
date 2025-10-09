import React, { Component } from 'react'

export default class main extends Component {
  render() {
      var myStyle={color:'red',fontFamily:'Courier',fontSize:40}

        var name="Raj gs";
        var a=10,b=20;
        const PI=3.14;

        const marks=60;
        let text="";
        if(marks >=90) {
            text="Grade A++";
        }
        else{
            text="Grade A"
        }

        return(
            <div id="main">
                <h1>Main Component</h1>
                <hr></hr>
                <h3>JSX - JavaScript - HTML/XML</h3>
                <p>
                JSX stands for JavaScript XML.<br></br>JSX allows us to write HTML in React.
<br></br>JSX makes it easier to write and add HTML in React.JSX converts HTML tags into react elements.  
                </p>
                <h4>Expressions in JSX using { } braces</h4>
                <h1>React is {5 + 5} times better with JSX</h1>
                <h2>The Multiplication of 10 & 20 is : { 10 * 20 }.</h2>

                <h4>Large Block of Elements</h4>
                <h2>Fruits</h2>
                <ul>
                    <li>Apples</li>
                    <li>Banana</li>
                    <li>Cherries</li>
                </ul>
               
                <h4>Comments In React JS are introduced using { /*  */ }</h4>
                {/*This is a comment in JSX */}
                <h4>JSX Styling</h4>
                <h2 style={myStyle}>Iam Trainee Engineer at Wells Fargo</h2>
                <h3 class="hello">We are React Developers</h3>

                <h2>Using JS Variables in JSX</h2>
                <p> My Name is : {name} . Grade is :{text}</p>
                <p>The Addition of {a} and {b} is :{a+b}</p>
                <p>The Value of PI is : {PI}</p>
            </div>
        );
  }
}

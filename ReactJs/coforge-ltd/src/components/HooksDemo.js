import React, { useState, useEffect, useRef, useMemo, useCallback } from 'react'
import '../styles/HooksDemo.css'

//rafc
export const HooksDemo = () => {

    //ush
    const [count, setCount] = useState(0);
    const [text, setText] = useState('');

    //urh
        // useRef: To access input element
        const inputRef = useRef(null);

        //ueh - useEffect
        //Runs when count changes
        useEffect(() => {
            return () => {
                document.title = `Count: ${count}`;
            }
        }, [count]);

        //umh
        const factorial = useMemo(() => {
            console.log("Calculating factorial...");
            return calculateFactorial(count);
            
        }, [count]);

        //ucbh
        const focusInput = useCallback(
            () => {
               inputRef.current.focus();
            },
            [],
        );


  return (
     <div className="hooks-container">
      <h2>React Hooks Demo</h2>
      <p>Hooks in ReactJS are functions that enable functional components to "hook into" React state and lifecycle features. Introduced in React 16.8, they allow developers to use features previously exclusive to class components, such as state management and side effects, within functional components</p>
<ul>
    <li><strong>useState:</strong> 
        <ul>
            <li>Used to store and manage component state.</li>
            <li>Returns an array with the current state and a function to update it.</li>
            <li>Example: <code>const [count, setCount] = useState(0);</code></li>
        </ul>
    </li>

    <li><strong>useEffect:</strong>
        <ul>
            <li>Performs side effects in functional components (like fetching data, updating the DOM, timers).</li>
            <li>Can run after every render or only when specific dependencies change.</li>
            <li>Example: <code>useEffect(() =&gt; { document.title = `Count: ${count}` }, [count]);</code></li>
        </ul>
    </li>

    <li><strong>useRef:</strong>
        <ul>
            <li>Stores a mutable reference to a DOM element or value that persists across renders.</li>
            <li>Does not cause re-render when updated.</li>
            <li>Example: <code>const inputRef = useRef(null);</code></li>
        </ul>
    </li>

    <li><strong>useMemo:</strong>
        <ul>
            <li>Memoizes the result of an expensive computation.</li>
            <li>Runs only when dependencies change.</li>
            <li>Example: <code>const value = useMemo(() =&gt; computeValue(data), [data]);</code></li>
        </ul>
    </li>

    <li><strong>useCallback:</strong>
        <ul>
            <li>Returns a memoized version of a function.</li>
            <li>Useful when passing callbacks to child components to prevent unnecessary renders.</li>
            <li>Example: <code>const handleClick = useCallback(() =&gt; { console.log("Clicked")}, []);</code></li>
        </ul>
    </li>

    <li><strong>useContext:</strong>
        <ul>
            <li>Accesses values from React Context without prop drilling.</li>
            <li>Example: <code>const user = useContext(UserContext);</code></li>
        </ul>
    </li>

    <li><strong>useReducer:</strong>
        <ul>
            <li>Manages complex state logic with a reducer function.</li>
            <li>Good alternative to useState when state transitions are complex.</li>
            <li>Example: <code>const [state, dispatch] = useReducer(reducer, initialState);</code></li>
        </ul>
    </li>
</ul>


      {/* useState */}
      <div className="section">
        <h3>useState & useEffect</h3>
        <p>Count: {count}</p>
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setCount(count - 1)}>Decrement</button>
      </div>

      {/* useMemo */}
      <div className="section">
        <h3>useMemo</h3>
        <p>Factorial of {count} is: {factorial}</p>
      </div>

      {/* useRef & useCallback */}
      <div className="section">
        <h3>useRef & useCallback</h3>
        <input
          ref={inputRef}
          type="text"
          value={text}
          onChange={(e) => setText(e.target.value)}
          placeholder="Type something..."
        />
        <button onClick={focusInput}>Focus Input</button>
      </div>
    </div>

  )
}


// Helper function for factorial calculation
function calculateFactorial(n) {
  if (n <= 0) return 1;
  return n * calculateFactorial(n - 1);
}

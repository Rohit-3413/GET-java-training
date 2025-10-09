import React from 'react'

//rfc
export default function ListDemo() {        /* Functional Component */

    var numbers = [1, 2, 3, 4, 5];
 const doubled = numbers.map((number) =>{ return <li> {number * 2}</li>});

 const myList = ['Peter', 'Sachin', 'Kevin', 'Dhoni', 'Alisa'];   
const listItems = myList.map((myList)=>{   
    return <li>{myList}</li>;   
});   

const Movies = [
  { id: 1, name: 'Reservoir Dogs' },
  { id: 2, name: 'Airplane' },
  { id: 3, name: 'Doctor Zhivago' },
  { id: 4, name: 'Memento' },
  { id: 5, name: 'Braveheart' },
  { id: 6, name: 'Beauty and the Beast' },
  { id: 7, name: 'Seven' },
  { id: 8, name: 'The Seven Samurai' }
];

const users = [
  {
      id: 1,
      name: 'Robin Williams',
      occupation: 'teacher',
  },
  {
      id: 2,
      name: 'John Doe',
      occupation: 'gardener',
  },
  
  {
      id: 3,
      name: 'Rohit Gupta',
      occupation: 'Software Engr',
  },
];

  return (
     <div style={{color:'brown',backgroundColor:'yellow',width:'900px',
           marginLeft: "auto",marginRight: "auto"
             }}>
             <h1>React Lists & Keys</h1>
             <ul>
                 <li>Lists are used to display data in an ordered format and mainly used to display menus on websites.</li>
                 <li>In React, Lists can be created in a similar way as we create lists in JavaScript.</li>
                 <li>The map() function is used for traversing the lists. </li>
                 
             </ul>
             <h2>Rendering Lists inside component</h2>  
           
                <ul>{doubled}</ul>
                <ul> {listItems} </ul>

                <h1>Keys</h1>
                <ul>
                 <li>A key is a unique identifier.</li>
                 <li> In React, it is used to identify which items have changed, updated, or deleted from the Lists.</li>
                 <li>It is useful when we dynamically created components or when the users alter the lists. </li>
                 <li>It also helps to determine which components in a collection needs to be re-rendered instead of re-rendering the entire set of components every time.</li>
                <li>Keys should be given inside the array to give the elements a stable identity.</li>
                <li>The best way to pick a key as a string that uniquely identifies the items in the list. </li>
             </ul>
             <ul>
      {Movies.map(data => (
        <li key={data.id}>{data.id}  - {data.name}</li>
      ))}
    </ul>
    <hr></hr>
             <ul>
        {users.map(user => (
            <li key={user.id}>
                <div>{user.id}</div>
                <div>{user.name}</div>
                <div>{user.occupation}</div>
            </li>
        ))}
    </ul>
    </div>
  )
}

import React from 'react'

//rfc
export default function Profile() {

     const user = {
        name: 'Hedy Lamarr',
        imageUrl: 'images/hedy.webp',
        imageSize: 90,
        city: 'California'
      };

      const person = {
        name: 'Gregorio Y. Zara',
        theme: {
          backgroundColor: 'black',
          color: 'pink',
        
        }
      };

  return (
     <>
    <div>
         <h1>{user.name} from {user.city}</h1>
      <img
        className="avatar"
        src={user.imageUrl}
        alt={'Photo of ' + user.name}
        style={{
          width: user.imageSize,
          height: user.imageSize
        }}
      />

    </div>

    <div style={person.theme}>
    <h1>{person.name}'s Todos</h1>
    <img
      className="avatar"
      src="images/Gregorio.webp"
      alt="Gregorio Y. Zara"
    />
    <ul>
      <li>Improve the videophone</li>
      <li>Prepare aeronautics lectures</li>
      <li>Work on the alcohol-fuelled engine</li>
    </ul>
  </div>
  </>
  )
}

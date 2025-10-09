import React, { Component } from 'react'


export default class Main extends Component {
  render() {
    return (
       <div style={{
                justifyContent: 'Center',
                alignItems: 'Right',
                height: '100vh',
                color:'white',
                backgroundColor:'crimson'
              }}>
                <h1>Welcome to Coforge</h1>
                <br></br>
                <img src={'https://www.coforge.com/hs-fs/hubfs/Greater%20Noida%20office%20aerial%20view-1.png?width=1000&height=644&name=Greater%20Noida%20office%20aerial%20view-1.png'}
                height={'400px'} width={'600px'} alt={'Coforge'}/>

                <h2>{27+40}</h2>
            </div>

    )
  }
}


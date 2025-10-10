import React, { useState, useEffect } from 'react'
import { getUsersWithFetch, getUsersWithAxios } from '../service/UserService';
import '../styles/RestAPIDemo.css'

//rafc
export const RestAPIDemo = () => {

    //ush -- define states & setter methods
    const [fetchUsers, setFetchUsers] = useState([]);
    const [axiosUsers, setAxiosUsers] = useState([]);
    const [loading, setLoading] = useState(true);

    //manage lifecycle of component
    // Fetch API call

    //ueh
    useEffect(() => {
    
      const fetchData = async () => {
      const users = await getUsersWithFetch();
      setFetchUsers(users);
      setLoading(false);
    };
    fetchData();
    
       }, []);

    // Axios API call
    useEffect(() => {

     const fetchData = async () => {
      const users = await getUsersWithAxios();
      setAxiosUsers(users);
    };
    fetchData();
    }, []);


  return (
     <div className="api-container">
      <h2>React Hooks API Demo (Service Implementation)</h2>

      {loading ? (
        <p className="loading">Loading data...</p>
      ) : (
        <>
          <div className="api-section">
            <h3>Fetch API Data</h3>
            <ul>
              {fetchUsers.map(user => (
                <li key={user.id}>
                  <strong>{user.name}</strong> — {user.email} - {user.address.street}
                </li>
              ))}
            </ul>
          </div>

          <div className="api-section">
            <h3>Axios API Data</h3>
            <ul>
              {axiosUsers.map(user => (
                <li key={user.id}>
                  <strong>{user.name}</strong> — {user.email} - {user.address.city} - {user.company.name}
                </li>
              ))}
            </ul>
          </div>
        </>
      )}
    </div>
  )
}

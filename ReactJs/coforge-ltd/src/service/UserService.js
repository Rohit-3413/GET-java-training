import axios from 'axios'

//axios & fetch API is used acess REST-API

const API_URL = 'https://jsonplaceholder.typicode.com/users';

// Fetch API Method
export const getUsersWithFetch = async () => {
  try {
    const response = await fetch(API_URL);
    if (!response.ok) {
      throw new Error('Fetch API Error: ' + response.status);
    }
    return await response.json();
  } catch (error) {
    console.error(error);
    return [];
  }
};

// Axios Method
export const getUsersWithAxios = async () => {
  try {
    const response = await axios.get(API_URL);
    return response.data;
  } catch (error) {
    console.error(error);
    return [];
  }
};

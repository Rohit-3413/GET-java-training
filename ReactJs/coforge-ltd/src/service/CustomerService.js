import axios from "axios";
/*
  Axios is a widely-used library for making HTTP requests in both the 
  browser and Node.js. 
  It simplifies tasks like fetching data from APIs, handling errors, and 
  managing request/response transformations.

  >npm install axios
*/
const BASE_URL = "http://localhost:8088/producthive/api/customers"; // Update as per your backend URL.

const saveCustomer = (data) => {
  return axios.post(BASE_URL, data, {
    headers: {
      "Content-Type": "multipart/form-data",
    },
  });
};

const getAllCustomers = () => {
  return axios.get(BASE_URL);
};

export default {
  saveCustomer, getAllCustomers,
};

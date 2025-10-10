import React, { useState } from 'react'
import CustomerService from '../service/CustomerService'
import '../styles/CustomerForm.css'


export const CustomerForm = () => {

    //ush
    const [formData, setFormData] = useState({
        firstName: "",
        lastName: "",
        passport: null,
        image: null,
    });

    //ush
    const [message, setMessage] = useState("");

    //Spread Operator(...)

    /*The spread operator in JavaScript, represented by three dots (...), is a powerful and versatile 
    tool used to expand elements of an iterable (like arrays, strings, or objects) into individual
    elements or properties.
    */
     const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });       //...spread operator
  };

  const handleFileChange = (e) => {
    const { name, files } = e.target;
    setFormData({ ...formData, [name]: files[0] });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    const { firstName, lastName, passport, image } = formData;

    if (!firstName || !lastName || !passport || !image) {
      setMessage("All fields are required.");
      return;
    }

    const data = new FormData();
    data.append("firstName", firstName);
    data.append("lastName", lastName);
    data.append("passport", passport);
    data.append("image", image);

    try {
      const response = await CustomerService.saveCustomer(data);
      setMessage("Customer saved successfully");
    } catch (error) {
      setMessage("Error saving customer: " + error.message);
    }
  };


  return (
     <div className="form-container">
      <h2>Add Customer Form - Saved to DB using Spring Boot REST API</h2>
      <form onSubmit={handleSubmit} className="customer-form">
        <label>
          First Name:
          <input
            type="text"
            name="firstName"
            value={formData.firstName}
            onChange={handleInputChange}
            required
          />
        </label>
        <label>
          Last Name:
          <input
            type="text"
            name="lastName"
            value={formData.lastName}
            onChange={handleInputChange}
            required
          />
        </label>
        <label>
          Passport:
          <input
            type="file"
            name="passport"
            accept=".pdf,.jpg,.png"
            onChange={handleFileChange}
            required
          />
        </label>
        <label>
          Image:
          <input
            type="file"
            name="image"
            accept=".jpg,.png"
            onChange={handleFileChange}
            required
          />
        </label>
        <button type="submit">Submit</button>
      </form>
      {message && <p className="message">{message}</p>}
    </div>
  )
}

import React, { useState, useEffect } from 'react'
import CustomerService from '../service/CustomerService'
import '../styles/Customer.css'

export const DisplayCustomers = () => {
   const [customers, setCustomers] = useState([]);
//    const [selectedPassport, setSelectedPassport] = useState(null);

   useEffect(() => {
    //Ftech customers from API on component load
    const fetchCustomers = async () => {
        try {
            const response = await CustomerService.getAllCustomers();
            setCustomers(response.data);
        } catch (error) {
            console.log("Error fetching customers", error.message);
        }
    };

    fetchCustomers();
   }, []);

   //user methods
   const handlePassportClick = (passportData, fileName) => {
    // Convert Base64 string to a binary Blob
    const byteCharacters = atob(passportData); // Decode Base64 string
    const byteNumbers = new Array(byteCharacters.length).fill(null).map((_, i) => byteCharacters.charCodeAt(i));
    const byteArray = new Uint8Array(byteNumbers);
    const blob = new Blob([byteArray], { type: "application/pdf" });
  
    // Create an object URL for the Blob
    const objectURL = URL.createObjectURL(blob);
  
    // Open the PDF in a new tab
    window.open(objectURL);
  
    // Create a download link programmatically
    const downloadLink = document.createElement("a");
    downloadLink.href = objectURL;
    downloadLink.download = fileName;
    downloadLink.click();
  };

  return (
    <div className="table-container">
      <h2>Customer List from DB using Spring Boot REST API</h2>
      <table className="customer-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Image</th>
            <th>Passport</th>
          </tr>
        </thead>
        <tbody>
          {customers.map((customer) => (
            <tr key={customer.id}>
              <td>{customer.customerId}</td>
              <td>{customer.firstName}</td>
              <td>{customer.lastName}</td>
              <td>
                <img
                  src={`data:image/jpeg;base64,${customer.image}`}
                  alt="Customer"
                  className="customer-image"
                />
              </td>
              <td>
                <button
                  onClick={() =>
                    handlePassportClick(
                      customer.passport,
                      `passport_${customer.id}.pdf`
                    )
                  }
                >
                  View Passport
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

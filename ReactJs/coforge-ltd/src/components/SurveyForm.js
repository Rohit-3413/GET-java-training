import React, { useState} from 'react'
import '../styles/SurveyForm.css'
import SurveyResult from './SurveyResult';

export default function SurveyForm() {

  //ush
  const [formData, setFormData] = useState(
    {
      name: "",
      email: "",
      feedback: "",
      rating: "5",
    }
  );

  //ush
  const [submitted, setSubmitted] = useState(false);

  // Handle input changes
  function handleChange(event) {
    const { name, value } = event.target;
    setFormData({ ...formData, [name]: value });
  }

  // Handle form submit
  function handleSubmit(event) {
    event.preventDefault();
    setSubmitted(true);
  }

  // Reset form to take another survey
  function resetSurvey() {
    setFormData({ name: "", email: "", feedback: "", rating: "5" });
    setSubmitted(false);
  }


  return (
    <div className="container">
      <h1>📝 React Survey Form</h1>
      <hr />

      {!submitted ? (
        <form onSubmit={handleSubmit} className="survey-form">
          <label>Name:</label>
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
            placeholder="Enter your name"
            required
          />

          <label>Email:</label>
          <input
            type="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            placeholder="Enter your email"
            required
          />

          <label>Feedback:</label>
          <textarea
            name="feedback"
            value={formData.feedback}
            onChange={handleChange}
            placeholder="Your feedback here..."
            required
          ></textarea>

          <label>Rating:</label>
          <select name="rating" value={formData.rating} onChange={handleChange}>
            <option value="5">⭐⭐⭐⭐⭐ Excellent</option>
            <option value="4">⭐⭐⭐⭐ Good</option>
            <option value="3">⭐⭐⭐ Average</option>
            <option value="2">⭐⭐ Poor</option>
            <option value="1">⭐ Very Poor</option>
          </select>

          <button type="submit">Submit Survey</button>
        </form>
      ) : (
        <SurveyResult data={formData} onReset={resetSurvey} />
      )}
    </div>

  )
}


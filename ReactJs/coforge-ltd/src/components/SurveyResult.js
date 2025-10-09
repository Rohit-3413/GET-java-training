import React from 'react'
import '../styles/SurveyResult.css'

//rfc
export default function SurveyResult({data, onReset}) {
  return (
    <div className="result-container">
      <h2>🎉 Survey Submitted Successfully!</h2>
      <p><strong>Name:</strong> {data.name}</p>
      <p><strong>Email:</strong> {data.email}</p>
      <p><strong>Feedback:</strong> {data.feedback}</p>
      <p><strong>Rating:</strong> {data.rating} / 5</p>

      <button onClick={onReset}>Take Another Survey</button>
    </div>
  )
}


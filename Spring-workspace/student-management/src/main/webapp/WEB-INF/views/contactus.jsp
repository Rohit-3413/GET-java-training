<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
<link rel="stylesheet" href="/studentsoft/resources/static/css/contactus.css">
</head>
<body>
<div class="container">
        <h1>Spring University</h1>
        <h2>Contact Us</h2>
        <p>If you have any questions or need further information, feel free to reach out to us. We are here to help you!</p>
        
        <div class="contact-details">
            <p><strong>Address:</strong> 123 Spring St, University City, CA 94016</p>
            <p><strong>Phone:</strong> +1 (123) 456-7890</p>
            <p><strong>Email:</strong> contact@springuniversity.edu</p>
        </div>

        <div class="contact-form">
            <form action="#" method="post">
                <input type="text" name="name" placeholder="Your Name" required>
                <input type="email" name="email" placeholder="Your Email" required>
                <textarea name="message" rows="5" placeholder="Your Message" required></textarea>
                <button type="submit">Send Message</button>
            </form>
        </div>
        <div class="back-button">
            <a href="/studentsoft/">Back to Home Page</a>
        </div>
    </div>
</body>
</html>
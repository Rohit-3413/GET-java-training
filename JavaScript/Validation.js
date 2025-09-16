document.getElementById('registrationForm').addEventListener('submit', 
    function(event) { event.preventDefault();  // preventing reloading of webpage
    validateForm();
});

function validateForm() {
    const username = document.getElementById('username');
    const email = document.getElementById('email');
    const password = document.getElementById('password');
    const confirmPassword = document.getElementById('confirmPassword');

    // Clear previous error messages
    clearErrors();

    let isValid = true;

    if (username.value.trim() === '') {
        showError(username, 'Username is required');
        isValid = false;
    } else if (username.value.length < 3 || username.value.length > 25) {
        showError(username, 'Username must be between 3 and 25 characters');
        isValid = false;
    }

    if (email.value.trim() === '') {
        showError(email, 'Email is required');
        isValid = false;
    } else if (!isValidEmail(email.value)) {
        showError(email, 'Email is not valid');
        isValid = false;
    }

    if (password.value.trim() === '') {
        showError(password, 'Password is required');
        isValid = false;
    } else if (!isValidPassword(password.value)) {
        showError(password, 'Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character');
        isValid = false;
    }

    if (confirmPassword.value.trim() === '') {
        showError(confirmPassword, 'Confirm Password is required');
        isValid = false;
    } else if (confirmPassword.value !== password.value) {
        showError(confirmPassword, 'Passwords do not match');
        isValid = false;
    }

    if (isValid) {
        alert('Form submitted successfully!');
    }
}

function showError(input, message) {
    const formGroup = input.parentElement;
    const small = formGroup.querySelector('small');
    small.innerText = message;
    small.style.visibility = 'visible';
}

function clearErrors() {
    const smalls = document.querySelectorAll('small');
    smalls.forEach(small => {
        small.style.visibility = 'hidden';
    });
}

function isValidEmail(email) {
    const re = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    return re.test(email);
}

function isValidPassword(password) {
    const re = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return re.test(password);
}

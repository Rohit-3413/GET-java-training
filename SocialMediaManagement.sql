-- Social Media Management Database

-- Users Table

Create the Users table
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    bio TEXT
);

INSERT INTO Users (username, email, password, bio) VALUES
('rohit_123', 'alice@example.com', 'hashed_pass_1', 'Aspiring photographer.'),
('bob_the_builder', 'bob@example.com', 'hashed_pass_2', 'Building things one day at a time.'),
('fitness_freak', 'fitness@example.com', 'hashed_pass_3', 'Let's transform together.'),
('hello_world', 'hello@example.com', 'hashed_pass_4', 'Full Stack Java Developer.'),
('raj_cooks', 'raj@example.com', 'hashed_pass_5', 'Food blogger and recipe creator.');


-- Posts table

CREATE TABLE Posts (
    post_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    caption TEXT,
    mediaURL VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    likeCount INT DEFAULT 0,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Posts (user_id, caption, mediaURL) VALUES
(1, 'Enjoying the view from the top!', '(https://example.com/images/post1.jpg)'),
(2, 'Just finished a new project!', '(https://example.com/videos/post2.mp4)'),
(3, 'Level up! New PR hit.', '(https://example.com/images/post3.png)'),
(4, 'Java is fun , Let's go!', '(https://example.com/images/post4.jpg)'),
(5, 'My new pasta recipe is live!', '(https://example.com/videos/post5.mp4)');


-- Stories table

CREATE TABLE Stories (
    story_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    mediaURL VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    expiry_time TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Stories (user_id, mediaURL, expiry_time) VALUES
(1, '(https://example.com/stories/story1.jpg)', DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 24 HOUR)),
(2, '(https://example.com/stories/story2.mp4)', DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 24 HOUR)),
(3, '(https://example.com/stories/story3.jpg)', DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 24 HOUR)),
(4, '(https://example.com/stories/story4.mp4)', DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 24 HOUR)),
(5, '(https://example.com/stories/story5.jpg)', DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 24 HOUR));


-- Comments table

CREATE TABLE Comments (
    comment_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    post_id INT NOT NULL,
    comment_text TEXT NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (post_id) REFERENCES Posts(post_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Comments (user_id, post_id, comment_text) VALUES
(2, 1, 'Awesome view! Where is this?'),
(3, 1, 'Looks amazing!'),
(1, 2, 'Great work! How long did it take?'),
(4, 3, 'Congrats! What a project!'),
(5, 4, 'Can't wait to eat it!');


-- Messages table

CREATE TABLE Messages (
    message_id INT PRIMARY KEY AUTO_INCREMENT,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    message_text TEXT NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES Users(user_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES Users(user_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Messages (sender_id, receiver_id, message_text) VALUES
(1, 2, 'Hey Rohit, what are you working on?'),
(2, 1, 'Hi Bro, just a new art installation.'),
(3, 4, 'Hello bro, how is day going!'),
(4, 3, 'Thanks man! I appreciate it.'),
(5, 1, 'Hope you like my new recipe!');


-- Admins table

CREATE TABLE Admins (
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

INSERT INTO Admins (name, email) VALUES
('Mr. SK', 's.k@admin.com'),
('Tiger', 'tiger@admin.com'),
('Varun', 'varun@admin.com'),
('Madhuri', 'madhuri@admin.com'),
('Vicky', 'vicky@admin.com');


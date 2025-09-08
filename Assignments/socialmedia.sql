-- Social Media Management Database


USE assignment;


-- Users Table

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
('fitness_freak', 'fitness@example.com', 'hashed_pass_3', 'Lets transform together.'),
('hello_world', 'hello@example.com', 'hashed_pass_4','Full Stack Java Developer.'),
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
(4, 'Java is fun , Lets go!', '(https://example.com/images/post4.jpg)'),
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
(5, 4, 'Cant wait to eat it!');


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


/*

Query 1.1: Retrieve all posts and the username of the user who created each post. This uses an INNER JOIN to match user_id from the Posts table to user_id in the Users table.

SELECT
    P.post_id,
    P.caption,
    P.mediaURL,
    P.timestamp,
    U.username
FROM
    Posts AS P
JOIN
    Users AS U ON P.user_id = U.user_id;


Query 1.2: Find all comments for a specific post (e.g., Post ID 1) along with the username of the commenter.
This query joins Comments, Posts, and Users to get a complete picture of comments on a post.

SELECT
    C.comment_id,
    C.comment_text,
    U.username AS commenter_username
FROM
    Comments AS C
JOIN
    Users AS U ON C.user_id = U.user_id
WHERE
    C.post_id = 1;


Query 1.3: List all messages sent by a specific user (e.g., User ID 1) to another specific user (e.g., User ID 2).
This query uses aliases to distinguish between the sender and receiver in the Users table.


SELECT
    M.message_id,
    M.message_text,
    M.timestamp,
    Sender.username AS sender,
    Receiver.username AS receiver
FROM
    Messages AS M
JOIN
    Users AS Sender ON M.sender_id = Sender.user_id
JOIN
    Users AS Receiver ON M.receiver_id = Receiver.user_id
WHERE
    M.sender_id = 1 AND M.receiver_id = 2
ORDER BY
    M.timestamp ASC;


2. Aggregate Function Queries
These queries perform calculations on a set of values and return a single value.

Query 2.1: Get the total number of posts made by each user.
This uses COUNT() and GROUP BY to count the number of posts for each user.


SELECT
    U.username,
    COUNT(P.post_id) AS total_posts
FROM
    Users AS U
LEFT JOIN
    Posts AS P ON U.user_id = P.user_id
GROUP BY
    U.username
ORDER BY
    total_posts DESC;


Query 2.2: Find the total number of users and posts in the system.
This query uses COUNT() to get a simple count from each table.


SELECT
    (SELECT COUNT(*) FROM Users) AS total_users,
    (SELECT COUNT(*) FROM Posts) AS total_posts;


Query 2.3: Calculate the average number of likes per post.
This uses AVG() to find the average value in the likeCount column.

SELECT
    AVG(likeCount) AS average_likes
FROM
    Posts;


3. Subqueries
These queries use a nested query to get a result that is then used by the outer query.

Query 3.1: Find the usernames of all users who have created a post.
This query uses a subquery to select distinct user_id values from the Posts table.

SELECT
    username
FROM
    Users
WHERE
    user_id IN (SELECT DISTINCT user_id FROM Posts);


Query 3.2: Identify the post with the most comments.
This subquery first finds the post_id with the maximum comment count, then the outer query selects the post details.

SELECT
    post_id,
    caption,
    timestamp
FROM
    Posts
WHERE
    post_id = (SELECT post_id FROM Comments GROUP BY post_id ORDER BY COUNT(*) DESC LIMIT 1);


4. DML Operations (Data Manipulation Language)
These queries are used to modify the data in the tables.

Query 4.1: Update a user's biography.
This query modifies the bio field for a specific user.

UPDATE
    Users
SET
    bio = 'Experienced data analyst and coding enthusiast.'
WHERE
    username = 'fitness_freak';


Query 4.2: Delete a specific comment from a post (e.g., Comment ID 5).
This query removes a single record from the Comments table.

DELETE FROM
    Comments
WHERE
    comment_id = 5;


Query 4.3: Increment the like count for a specific post (e.g., Post ID 1).
This query updates the likeCount field for a single post.

UPDATE
    Posts
SET
    likeCount = likeCount + 1
WHERE
    post_id = 1;

*/
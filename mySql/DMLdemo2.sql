-- Step 1: Create Database
CREATE DATABASE collegedb;

-- Use the Database
USE collegedb;

-- Step 2: Create Tables
CREATE TABLE course (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    duration VARCHAR(50)
);

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    course_id INT,
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);

-- Step 3: Insert Courses
INSERT INTO course (course_name, duration) VALUES
('Computer Science', '4 Years'),
('Electronics', '4 Years'),
('Mechanical', '4 Years'),
('Civil Engineering', '4 Years'),
('Business Administration', '3 Years');

-- Step 4: Insert Students (25 students)
INSERT INTO students (student_name, email, course_id) VALUES
('Rahul Sharma', 'rahul.sharma@example.com', 1),
('Priya Verma', 'priya.verma@example.com', 1),
('Amit Kumar', 'amit.kumar@example.com', 1),
('Sneha Gupta', 'sneha.gupta@example.com', 1),
('Karan Singh', 'karan.singh@example.com', 1),

('Riya Mehta', 'riya.mehta@example.com', 2),
('Arjun Nair', 'arjun.nair@example.com', 2),
('Sonia Das', 'sonia.das@example.com', 2),
('Deepak Yadav', 'deepak.yadav@example.com', 2),
('Neha Reddy', 'neha.reddy@example.com', 2),

('Vikram Patil', 'vikram.patil@example.com', 3),
('Anjali Joshi', 'anjali.joshi@example.com', 3),
('Rohit Shetty', 'rohit.shetty@example.com', 3),
('Meena Roy', 'meena.roy@example.com', 3),
('Akash Jain', 'akash.jain@example.com', 3),

('Divya Rao', 'divya.rao@example.com', 4),
('Sandeep Kulkarni', 'sandeep.kulkarni@example.com', 4),
('Pooja Mishra', 'pooja.mishra@example.com', 4),
('Harsh Malhotra', 'harsh.malhotra@example.com', 4),
('Nidhi Agarwal', 'nidhi.agarwal@example.com', 4),

('Mohit Bansal', 'mohit.bansal@example.com', 5),
('Shreya Kapoor', 'shreya.kapoor@example.com', 5),
('Rajeev Menon', 'rajeev.menon@example.com', 5),
('Kavya Iyer', 'kavya.iyer@example.com', 5),
('Saurabh Ghosh', 'saurabh.ghosh@example.com', 5);

-- Step 5: Demonstrate DML Commands

-- SELECT
SELECT * FROM students;
SELECT s.student_name, c.course_name
FROM students s
JOIN course c ON s.course_id = c.course_id;

-- UPDATE (Change a student’s course)
UPDATE students SET course_id = 3 WHERE student_id = 2;

-- DELETE (Remove a student)
DELETE FROM students WHERE student_id = 5;

-- INSERT (Add a new student)
INSERT INTO students (student_name, email, course_id)
VALUES ('Tanvi Kulkarni', 'tanvi.kulkarni@example.com', 1);


DELETE FROM course WHERE course_id = 2; -- Foreign Key Error

-- ---------------------------------------------------------

-- 1. SELECT with WHERE condition (fetch students from Computer Science)
SELECT student_name, email 
FROM students 
WHERE course_id = 1;

-- 2. SELECT with ORDER BY (list students alphabetically)
SELECT student_name, email, course_id 
FROM students 
ORDER BY student_name ASC;

-- 3. SELECT with LIKE (find students whose name starts with 'S')
SELECT student_name, email 
FROM students 
WHERE student_name LIKE 'S%';

-- 4. SELECT with COUNT and GROUP BY (number of students per course)
SELECT c.course_name, COUNT(s.student_id) AS total_students
FROM course c
LEFT JOIN students s ON c.course_id = s.course_id
GROUP BY c.course_name;

-- 5. SELECT with DISTINCT (unique courses chosen by students)
SELECT DISTINCT course_id 
FROM students;

-- 6. UPDATE with condition (change all students in course 2 to course 5)
UPDATE students
SET course_id = 5
WHERE course_id = 2;

-- 7. DELETE with condition (remove students without email)
DELETE FROM students
WHERE email IS NULL;

-- 8. INSERT multiple rows at once
INSERT INTO students (student_name, email, course_id) VALUES
('Ananya Sharma', 'ananya.sharma@example.com', 3),
('Rakesh Reddy', 'rakesh.reddy@example.com', 4);

-- 9. SELECT with LIMIT (first 10 students only)
SELECT * FROM students
LIMIT 10;

-- 10. Aggregate Functions (AVG, MIN, MAX) on student IDs
SELECT 
    MIN(student_id) AS first_student,
    MAX(student_id) AS last_student,
    AVG(student_id) AS average_id
FROM students;



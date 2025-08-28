# DDL Commands - CREATE, ALTER, DROP, TRUNCATE, RENAME

/*Data Definition Language actually consists of the SQL commands that can be used to define the database schema. 
It simply deals with descriptions of the database schema and is used to create and modify the structure of database objects in the database.
DDL is a set of SQL commands used to create, modify, and delete database structures but not data. */

/*Create a db -- Follow normalization -- reduce rendundacy

1NF - Atomicity (Single Value), Primary Key

2NF - 1NF , Functional Dependency, Foreign Key

3NF - 2NF, No transive Dependency */

-- Create Database

CREATE DATABASE coforgedb;

USE coforgedb;

CREATE TABLE USER(
  id INT PRIMARY KEY AUTO_INCREMENT, 
  NAME VARCHAR(25),
  email VARCHAR(25)
                    );
                    
                  
                  
   DESCRIBE USER;




-- create table

CREATE TABLE department (
 deptid INT PRIMARY KEY AUTO_INCREMENT,
 deptname VARCHAR(25) NOT NULL,
 fees FLOAT NOT NULL,
 email VARCHAR(25) NOT NULL);



-- Display structure of Table

DESC department;

SHOW TABLES;
-- create table & set primary key at field level

CREATE TABLE student (
    rollno INT(10) PRIMARY KEY,
    firstname VARCHAR(25) NOT NULL,
    middlename VARCHAR(25),
    lastname VARCHAR(25) NOT NULL,
    dob DATE NOT NULL,
    did INT NOT null
                     );


DESC student;
SHOW TABLES;

# ALTER Table
-- The MySQL ALTER TABLE statement is used to add, modify, or drop/delete columns 
-- in a table. The MySQL ALTER TABLE statement is also used to rename a table.

/* Syntax:  Add column in table
 ALTER TABLE table_name
  ADD new_column_name column_definition
    [ FIRST | AFTER column_name ];  */
    
-- Add new column city  

ALTER TABLE student ADD city varchar(20) NOT NULL AFTER dob;

DESC student;


-- Modify column in a table

ALTER TABLE student MODIFY city VARCHAR(25) NULL;

DESC student;	

-- Rename column in a table
	
ALTER TABLE student CHANGE COLUMN middlename mid_name VARCHAR(20) NULL;

# drop a column in table

ALTER TABLE student DROP COLUMN mid_name;

DESC student;	

# rename table

ALTER TABLE department RENAME TO course;

SHOW TABLES;	

-- Create a new Table copy from existing Table

CREATE TABLE student_copy AS SELECT * FROM student;
-- CREATE TABLE student_cse AS SELECT * FROM student WHERE course_id LIKE 'CSE' ; 

SHOW TABLES;


-- Delete table

DROP TABLE student_copy;
SHOW TABLES;

/* MySql Constraints:

The constraint in MySQL is used to specify the rule that allows or restricts what values/data will be stored in the table. 
They provide a suitable method to ensure data accuracy and integrity inside the table. 
It also helps to limit the type of data that will be inserted inside the table.
*/
# DEFAULT constraint - Specifies a default value when specified none for this column

/*
#Check constraint - It is an integrity constraint that controls the value in a particular column. 
It ensures the inserted or updated value in a column must be matched with the given condition.
*/

/*
#AUTO_INCREMENT Constraint
This constraint automatically generates a unique number whenever we insert a new record into the table. 
Generally, we use this constraint for the primary key field in a table.
*/

CREATE TABLE staff(
   id INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR(25),
   email VARCHAR(25),
   city VARCHAR(20) DEFAULT 'Bangalore',
   doj DATETIME DEFAULT NOW()
                              );
                              
   DESC staff;

	
-- Inserting data into staff table which has auto_increment & default values	
	
INSERT INTO staff(NAME, email) VALUES('Raj', 'raj@training.com');

INSERT INTO staff(NAME, email) VALUES('Mike', 'mike@training.com');

INSERT INTO staff(NAME, email) VALUES('Mary', 'mary@training.com');

SELECT * FROM staff;

-- insert data into default columns

INSERT INTO staff(NAME, email, city) VALUES('Navin', 'navi@training.com', 'Mumbai');

INSERT INTO staff(NAME, email, city, doj) VALUES('Hary', 'hary@training.com', 'Noida', '2017-06-01');

SELECT * FROM staff;

-- set the new seed value for AUTO_INCREMENT

ALTER TABLE staff AUTO_INCREMENT=100;

INSERT INTO staff(NAME,email, city, doj) VALUES ('Manoj', 'manu@training.com', 'Mumbai', '2015-12-15');

INSERT INTO staff(NAME,email, city, doj) VALUES ('Mahesh', 'mahi@training.com', 'Chennai', CURRENT_DATE);

SELECT * FROM staff;
-- # Check Constraint
-- CHECK constraint to ensure that values stored in a column or group of 
-- columns satisfy a Boolean expression.



-- Unique Constraint
/* A UNIQUE constraint is an integrity constraint that ensures values in a column 
or group of columns to be unique.  
A UNIQUE constraint can be either a column constraint or a table constraint. */



-- throw check constraint error for gender



-- throw check constraint error for salary





-- throw PRIMARY KEY constraint error for ID


-- throw check constraint error for salary



-- throw unique constraint error for phone no




-- not null constraint 




--- Creating Foreign Key Relationship

/* The foreign key is used to link one or more than one table 
together. It is also known as the referencing key. 
A foreign key matches the primary key field of another table. 
It means a foreign key field in one table refers to the primary key 
field of the other table. */

/* 
Syntax: [CONSTRAINT constraint_name]  
    FOREIGN KEY [foreign_key_name] (col_name, ...)  
    REFERENCES parent_tbl_name (col_name,...)  
    ON DELETE referenceOption  
    ON UPDATE referenceOption  */

USE coforge;




-- foreign key error


/* CASCADE: It is used when we delete or update any row from the 
parent table, the values of the matching rows in the child table 
will be deleted or updated automatically.

RESTRICT: It is used when we delete or update any row from the parent
table that has a matching row in the reference(child) table, 
MySQL does not allow to delete or update rows in the parent table. */



-- cascade demo



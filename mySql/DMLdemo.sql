# DML Operations - INSERT , UPDATE , DELETE

-- The INSERT statement allows you to insert one or more rows into a table. 
-- The following illustrates the syntax of the INSERT statement:

/*INSERT INTO table(c1,c2,...)
VALUES (v1,v2,...); */

desc departments;

-- Insert demo without specifying column names

USE classicmodels;

DESC customersbackup2025;


INSERT INTO customersbackup2025 VALUES(
9999, 'Raj Associates','GS', 'Rohit', '5444871236', 'SHri Nilaya',
  'Down Town Lane', 'Udupi', 'Karnataka', '574101', 'India',NULL, 50000.00);
  
SELECT * FROM customersbackup2025;

USE coforgedb;

SELECT * FROM departments;

INSERT INTO departments values(100,'Technical');

INSERT INTO departments values(104,'Production');

INSERT INTO departments values(105,'Travel');

SELECT * FROM departments;

-- Insert demo specifying columns fields

DESC departments;

INSERT INTO department(deptName,fees,email) VALUES('Mech',75000,'mech@vtu.ac.in');

INSERT INTO department(deptName,fees,email) VALUES('EE',90000,'ee@vtu.ac.in');

INSERT INTO department(deptName,fees,email) VALUES('CSE',100000,'cse@vtu.ac.in');

SELECT * FROM department;

/*
The UPDATE statement updates data in a table. 
It allows you to change the values in one or more columns of a single row or multiple rows.

 syntax of the UPDATE statement:

UPDATE  table_name 
SET 
    column_name1 = expr1,
    column_name2 = expr2,
    ...
[WHERE
    condition];
*/

USE college;

SELECT * from department;

-- Update department fees of cse to 1,20,000

UPDATE department SET fees=120000 WHERE deptId=3;

UPDATE department SET fees=90000,email='mech22@vtu.ac.in' WHERE deptId=1;

SELECT * from department;

USE classicmodels;

SELECT * FROM employees WHERE employeeNumber=1401;

-- Update lastName, emailid of Pamela

UPDATE employees
	SET lastName='George', email='pamela.george@classicmodelcars.com'
		WHERE employeeNumber=1401;

SELECT * FROM employees WHERE employeeNumber=1401;

-- Update email domain of all Sales Reps with office code 6 to @sydneyclassicmodelcars.com

SELECT * FROM employees WHERE officeCode=6;
SELECT * FROM offices WHERE officeCode=6;

UPDATE employees
	SET email = REPLACE(email,'@classicmodelcars.com','@sydneyclassicmodelcars.com')
		WHERE jobTitle='Sales Rep' AND
			officeCode=6;
			
SELECT * FROM employees WHERE officeCode=6;

# DELETE statement
 /*To delete data from a table, you use the MySQL DELETE statement. 
 
 syntax of the DELETE statement:

DELETE FROM table_name
WHERE condition;  */

USE college;

SELECT * FROM departments;

-- Delete Travel department

DELETE FROM departments WHERE dept_id=105;

SELECT * FROM departments;

USE classicmodels;

SELECT * FROM employessbackupjune2022;  -- 23 records

DELETE FROM employessbackupjune2022 WHERE officeCode=4;

SELECT count(*) FROM employessbackupjune2022; -- 18  records

-- delete all records

DELETE FROM employessbackupjune2022; -- caution don't execute

-- Using LIMIT clause in delete

CREATE TABLE customersbackup2025 AS SELECT * FROM customers;

SELECT * FROM customersbackup2025;

SELECT * FROM customersbackup2025  WHERE country='France'; -- 12 customers

-- Delete customers from France with low 5 Credit Limit
DELETE FROM customersbackup2022 WHERE country='France'
	ORDER BY creditLimit LIMIT 5; -- Without LIMIT it will delete all 12 customers


-- Deleting Table

# Drop statement removes the table permanently from database

DROP TABLE employessbackupjune2025;

SHOW TABLES;




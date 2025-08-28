/* MySQL/MariaDB is a RDBMS software used to Store & Manage data.

MySQl founder- Michael Widenius. His 2 daughters - My  & Maria

/* Heidi SQL - It's an IDE for working with MariaDB. It's installed 		automatically.
/* My -  It's an IDE for working with MySQL. It's an standalone Installation*/
/*


*/
/*Data is information such as facts and numbers used to analyze something or make decisions.*/
/*
Database is merely a structured collection of data.
Database is a collection of inter-related Tables.
Table is a collection of Records.
Record is a collection of fields.

The data relating to each other by nature, e.g., a product belonged to a product 
category and associated with multiple tags. Therefore, we use the term relational database.
A table may relate to another table using a relationship
*/

/* Eg:
 classicmodels- Database
 employees,customers,offices,products - Tables
*/
/*An RDBMS is a type of database management system (DBMS) that stores data in a 
row-based table structure which connects related data elements. 

SQL- SQL is a standard language for storing, manipulating and retrieving data in databases.

   DML - SELECT, INSERT, UPDATE, DELETE
   DDL- CREATE,ALTER,DROP
   TCL - COMMIT, ROLLBACK, SAVEPOINT
   DCL - GRANT REVOKE
   
   
# The SELECT statement allows you to retreieve data from one or more tables
-- Select Statements Syntax

-- SELECT select_list FROM table_name;
*/



 /* selection  - select all columns/records */
 SELECT * FROM customers;
 
 SELECT * FROM employees;


 /* projection -- select specific columns */
 SELECT lastName FROM employees;

SELECT productCode, productName, buyPrice FROM products;

#display structure of the table


DESCRIBE employees;

DESC products;



#----------------------------------------------------------------
-- Filter Records

#MySQL WHERE clause

-- The WHERE clause allows you to specify a search condition for the rows 
-- returned by a query.
# Syntax :
/*  SELECT 
    select_list
FROM
    table_name
WHERE
    search_condition;  */
    
SELECT employeeNumber, lastname, firstname, jobtitle, email FROM employees;


-- Display Sales rep's in the organization

SELECT employeeNumber, lastname, firstname, jobtitle, email
 FROM employees
   WHERE jobTitle ='Sales rep';



-- Display orders with quantity greater then 50

SELECT * FROM orderdetails WHERE quantityOrdered >= 50;


/* The search_condition is a combination of one or more predicates using the 
logical operator AND, OR and NOT.

AND- All conditions should be TRUE
OR - Any one of the conditions should be TRUE.
NOT - Negate the Condition .
 */

/* Example uses the WHERE clause to find employees whose job titles are 
Sales Rep and office codes are 1 */

SELECT employeeNumber, lastname, firstname, jobTitle, email, officeCode
 FROM employees
    WHERE jobTitle= 'Sales Rep' AND officeCode =1;
    
    
SELECT * FROM orderdetails
  WHERE quantityOrdered >= 50 AND priceEach > 100;




-- OR operator
 -- query finds employees whose job title is Sales Rep or employees who 
 -- locate the office with office code 1:

SELECT employeeNumber, lastname, firstname, jobTitle, email, officeCode
 FROM employees
    WHERE jobTitle= 'Sales Rep' OR officeCode =1;
    
		
		
-- The BETWEEN operator returns TRUE if a value is in a range of values:
 
 -- Syntax: expression BETWEEN low AND high
 
 -- query finds employees who locate in offices whose office code is from 1 to 3:
 
 SELECT employeeNumber, lastname, firstname, jobTitle, email, officeCode
 FROM employees
    WHERE officeCode BETWEEN 1 AND 3;
    



-- query to list orders done in the first quarter of 2004 .

SELECT * FROM orders;

SELECT * FROM orders WHERE shippedDate BETWEEN '2004-01-01' AND '2004-03-31';


# MySQL WHERE with the LIKE operator
 
 /* The LIKE operator evaluates to TRUE if a value matches a specified pattern. 
 To form a pattern, you use % and _ wildcards. 
 The % wildcard matches any string of zero or more characters 
 while the _ wildcard matches any single character. */
 
 -- query finds employees whose last names end with the string 'son':
 
SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE lastname LIKE '%son';
 
 SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE lastname LIKE 'B%';
 
 
 
-- ANSI SQL is Case Insensitive

SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE lastname LIKE 'B%' OR firstname LIKE 'd%';
 
 SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE firstname LIKE '_arry';
 
 SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE firstname LIKE 'A%';



-- NOT -- Negates the condition

SELECT employeeNumber, lastname, firstname, jobTitle, email
 FROM employees WHERE firstname NOT LIKE 'A%';

	
#MySQL WHERE clause with the IN operator

-- The IN operator returns TRUE if a value matches any value in a list.
-- Syntax
-- value IN (value1, value2,...)

-- IN condition is used to help reduce the need to use multiple OR conditions in a 
-- SELECT, INSERT, UPDATE, or DELETE statement.

SELECT employeeNumber, lastname, firstname, jobTitle, email, officeCode
 FROM employees 
   WHERE -- officeCode = 1 OR officeCode = 5 OR OfficeCode = 7;
    officeCode IN(1,5,7) ORDER BY officecode;


SELECT * FROM customers WHERE contactLastName IN ('Young', 'Smith');

SELECT * FROM customers WHERE contactLastName NOT IN ('Taylor', 'Brown');



#MySQL WHERE  clause with the IS NULL operator
-- Null -> Absence of Data or Data is missing

/* To check if a value is NULL or not, you use the IS NULL operator, 
not the equal operator (=). The IS NULL operator returns TRUE if a value is NULL.

Syntax: 
value IS NULL  */ 		
		
-- Display employees who doesn't have Managers allocated		

SELECT employeeNumber, lastname, firstname, jobTitle, email, reportsTo
 FROM employees WHERE reportsTo IS NULL;
 
 SELECT * FROM orders WHERE comments IS NULL;
 SELECT * FROM orders WHERE comments IS NOT NULL;
 
 SELECT * FROM orders WHERE comments = "";  -- not considered as NULL
 
 SELECT * FROM customers WHERE phone = 0;  -- not considered as NULL
 
 SELECT * FROM customers WHERE phone IS NULL;





#WHERE clause with comparison operators
-- >, <, >=, <=, =, <> or != (not equals)


SELECT firstname, lastname, jobTitle FROM employees
  WHERE jobTitle <> 'Sales Rep';
  
  
SELECT lastname, firstname, officeCode FROM employees
WHERE officecode > 5;
 


#---------------------------------------------------------------------------------
#MySQL ORDER BY clause
-- When you use the SELECT statement to query data from a table, 
-- the result set is not sorted. It means that the rows in the result set can 
-- be in any order.

-- To sort the result set, you add the ORDER BY clause to the SELECT statement
/* Syntax:
SELECT   select_list FROM    table_name
ORDER BY 
   column1 [ASC|DESC], 
   column2 [ASC|DESC],
   ...;  */

SELECT contactLastName, contactFirstName FROM customers;

-- sorts in ascending order

SELECT contactLastName, contactFirstName FROM customers ORDER BY contactLastName;


-- sort in descending order

SELECT contactLastName, contactFirstName FROM customers 
      ORDER BY contactLastName desc;


SELECT * FROM products;

SELECT productCode, productName, buyPrice FROM products ORDER BY buyprice DESC;

-- Sorting by Relative position in resultSet
SELECT productCode, productName, quantityInStock, buyPrice  
   FROM products 
	  ORDER BY 4 DESC;


-- Multi Level Sorting

SELECT contactLastName, contactFirstName 
 FROM customers 
      ORDER BY contactLastName, contactFirstName DESC;


SELECT jobTitle, firstName FROM employees ORDER BY 1 DESC, 2;

SELECT jobTitle, firstName FROM employees ORDER BY jobTitle, firstName;




#  ORDER BY to sort a result set by an expression	
	
SELECT orderNumber, orderlinenumber, quantityOrdered, priceEach,
  quantityOrdered * priceEach FROM orderdetails;
  
SELECT orderNumber, orderlinenumber, quantityOrdered * priceEach FROM orderdetails 
ORDER BY quantityOrdered * priceEach DESC;



-- Expressions with alias names

SELECT orderNumber, orderlinenumber, quantityOrdered * priceEach AS 'total price' FROM orderdetails;

SELECT orderNumber, orderlinenumber, quantityOrdered * priceEach AS TotalPrice 
  FROM orderdetails
     ORDER BY TotalPrice DESC; 
		
# ------------------------------------------------------------------------
# MySQL DISTINCT clause

-- When querying data from a table, you may get duplicate rows. 
-- In order to remove these duplicate rows, 
-- you use the DISTINCT clause in the SELECT statement.

/* Syntax: SELECT DISTINCT
    select_list
        FROM
    table_name;  */

SELECT lastname FROM employees ORDER BY lastname;

SELECT DISTINCT lastname FROM employees ORDER BY lastname;

SELECT DISTINCT state FROM customers;


-- Distinct with multiple columns

SELECT state, city FROM customers WHERE state IS NOT NULL ORDER BY state, city;

SELECT DISTINCT contactLastName, state, city FROM customers WHERE state IS NOT NULL ORDER BY contactLastName, state, city;

# -------------------------------------------------------------------------------
# LIMIT clause
-- is used to retrieve records from one or more tables in a database and limit the number
--  of records returned based on a limit value.


SELECT * FROM customers;

SELECT * FROM customers LIMIT 5;

SELECT * FROM customers /*order by*/ contactLastName LIMIT 10;


# The offset keyword allows you to offset the no. of record returned by 
-- the LIMIT clause.

SELECT * from customers LIMIT 5 OFFSET 4;




# -------------------------------------------------------------------------

# MySQL AND operator
 /* The AND operator is a logical operator that combines two or more Boolean 
 expressions and returns true only if both expressions evaluate to true. 
 The AND operator returns false if one of the two expressions evaluate to false. */

 -- Syntax: boolean_expression_1 AND boolean_expression_2

SELECT 1=0 AND 1/1;

SELECT customerName,country, state FROM customers
	WHERE country='USA' AND state='CA';

SELECT customerName,country, state FROM customers
	WHERE country='USA' AND state='CA' AND creditlimit > 100000;


# The MySQL OR operator combines two Boolean expressions and returns true when 
# either condition is true.
-- Operator Precedence OR then AND



 SELECT customerName,country, state FROM customers
	WHERE country='USA' OR country='France';

SELECT customerName,country, state,creditLimit FROM customers
	WHERE creditlimit > 100000 AND (country='USA' OR country='France');

	
# -----------------------------------------------------------------------------------------

# MySQL alias for columns
-- Sometimes, column names are so technical that make the query’s output very 
-- difficult to understand. To give a column a descriptive name, you can use a 
-- column alias.
	  
/* Syntax: 
SELECT 
   [column_1 | expression] AS descriptive_name
FROM table_name;  */


SELECT CONCAT(lastName, ' ', firstName) FROM employees;

SELECT CONCAT(lastName, ' ', firstName) AS 'Full Name' FROM employees; 

SELECT CONCAT(lastName, ' ', firstName) 'Full Name' FROM employees;

SELECT CONCAT(lastName, ' ', firstName) FullName FROM employees;


-- Alias name for Tables

SELECT * FROM employees e;

SELECT e.firstName, e.lastName FROM employees e ORDER BY e.firstName;


#----------------------------------------------------------------------------

# MySQL GROUP BY clause
 -- The GROUP BY clause groups a set of rows into a set of summary rows by values 
 -- of columns or expressions. The GROUP BY clause returns one row for each group. 
 -- In other words, it reduces the number of rows in the result set.
 
 /* You often use the GROUP BY clause with aggregate functions such as SUM, AVG, 
 MAX, MIN, and COUNT. The aggregate function that appears in the SELECT clause 
 provides information about each group. */
 
 /* Syntax: 
 SELECT c1, c2,..., cn, aggregate_function(ci)
FROM table
WHERE where_conditions
GROUP BY c1 , c2,...,cn; */


SELECT STATUS FROM orders;

SELECT STATUS FROM orders GROUP BY STATUS;

SELECT STATUS, COUNT(*) AS Total FROM orders GROUP BY STATUS;

SELECT STATUS, COUNT(*) 'Total Orders' FROM orders;

SELECT quantityInStock FROM products;

SELECT SUM(quantityInStock) 'Total Quantity' FROM products;

SELECT productLine, quantityInStock FROM products;

SELECT productLine, COUNT( quantityInStock) FROM products GROUP BY productLine;

SELECT jobTitle, COUNT(*) AS 'Count' FROM employees GROUP BY jobTitle;

SELECT * FROM employees;

-- Having clause is used to apply filter in group by clause

SELECT lastName FROM employees GROUP BY lastName HAVING COUNT(lastName) > 1;



 /* The GROUP BY clause is often used with an aggregate function to perform calculation and 
return a single value for each subgroup. */

-- Query to find sum of quantity of Products

SELECT productLine, sum(quantityInStock) FROM products GROUP BY productLine;

SELECT orderdate, Year(orderdate) FROM orders;

SELECT YEAR(orderdate) AS Year_, COUNT( orderNumber) FROM 
	orders GROUP BY Year_ 
		ORDER BY Year_ desc;

SELECT orderNumber,SUM(quantityOrdered * priceEach) as Total from orderDetails
group by orderNumber;


 

-- Query to display total no. of customers from each city

SELECT * FROM customers;

 SELECT city , COUNT(*) "Total Customers" from customers group by city;


 -- Design a query using max function to return name of the productLine
 -- and maximum buyPrice for each ProductLine
 
 
 
 SELECT productline, buyprice FROM products;
 
 SELECT productline, MAX(buyprice) FROM products GROUP BY productline;
 SELECT MAX(buyprice) FROM products;
 
 SELECT productline,buyprice FROM 
 	products WHERE buyprice=( SELECT MAX(buyprice) FROM products);
 -- Display total no of sales rep
 
 SELECT jobTitle, COUNT(*) AS total FROM employees WHERE 
 jobTitle='Sales Rep' -- GROUP BY jobTitle ;
 
 SELECT jobTitle, COUNT(*) AS total FROM employees
 	 GROUP BY jobTitle ;


# --------------------------------------------------------------------

# Scalar Functions
-- MySQL Scalar Functions allow you to perform different calculations 
-- on data values. 
-- These functions operate on single rows only and produce one result 
-- per row.

/* String functions – functions that perform operations on character values.
Numeric functions – functions that perform operations on numeric values.
Date functions – functions that perform operations on date values.
Conversion functions – functions that convert column data types.
NULL-related Functions – functions for handling null values.
*/	


-- String Functions	
	
SELECT LENGTH('Hello World');	

SELECT CONCAT('JDBC','SQL');

SELECT INSTR('JDBC','B'); -- Return location of substring in a string

SELECT TRIM('   SQL   JDBC');  -- truncates or removes extra spaces
	
SELECT LENGTH('   SQL');	

SELECT SUBSTR('JDBC Programming',1,2); -- Returns part of a string - specific pos,no. of characters

SELECT UPPER(customerName) customerName, city FROM customers;

SELECT LOWER(customerName)customerName, MID(city,1,3)ShortCity, city FROM customers;

SELECT UPPER(CONCAT(contactFirstName, ' ' , contactLastName)) AS 'Full Name',
   REVERSE (country), REPLACE( state, 'NY', 'KA') FROM customers;





-- Date Functions
SELECT NOW(), CURRENT_DATE, SYSDATE();

SELECT productName,buyPrice,NOW() DispatchDate FROM products;

-- DATEDIFF function calculates the number of days between two dates
            
SELECT DATEDIFF(CURRENT_DATE,'2022-02-01') NoOfDays;

SELECT * FROM orders;

-- To calculate the number of days between the required date and 
-- shipped date of the orders

SELECT orderNumber, requiredDate, shippedDate, DATEDIFF(requiredDate, shippedDate) DaysLeft
FROM orders
  ORDER BY DaysLeft DESC;
		
		
-- gets all orders whose statuses are in-process and calculates the number of 
-- days between ordered date and required date

SELECT orderNumber,DATEDIFF(requiredDate,orderDate) remainingDays from 
orders where status='In Process' order by remainingDays;


-- -- The DAY() function returns the day of the month of a given date. 

SELECT DAY(NOW());

SELECT DAY('2022-06-08');

SELECT DAYNAME(NOW()), WEEKDAY(CURRENT_DATE); -- weekday starts from monday -0

-- return the number of orders by day number in 2004.

SELECT DAY(orderdate) DAYOFMONTH, COUNT(*) FROM orders WHERE
 YEAR(orderdate)=2004 GROUP BY DAYOFMONTH ORDER BY DAYOFMONTH;


#Numeric Functions

-- The ABS() function is a mathematical function that returns the absolute (positive) 
-- value of a number.

SELECT ABS(-10), ABS(0), ABS(10), ABS(-9+5) , -9+5;

USE classicmodels;
SELECT * FROM products;

SELECT productName,buyPrice-MSRP, ABS(buyPrice-MSRP) FROM products;

-- The ROUND() is a mathematical function that allows you to round a number 
-- to a specified number of decimal places.

SELECT ROUND(20.5), ROUND(20.7), ROUND(20.1), ROUND(20.4);

SELECT ROUND(20.567,2), ROUND(20.5,0), ROUND(3.142356,3);

-- The number of decimal places (d) can be positive or negative. 
-- If it is negative, then the d digits left of the decimal point of the number 
-- n becomes zero.

SELECT ROUND(121.55,-2) ,ROUND(161.55,-2), ROUND(2013.567,-3),ROUND(2588.567,-3);

SELECT* FROM orderdetails;

SELECT productCode, AVG(quantityOrdered*priceEach) average_item_Value
	 FROM  orderdetails
	 	GROUP BY productCode;

SELECT productCode, AVG(quantityOrdered*priceEach),ROUND(AVG(quantityOrdered*priceEach)) average_item_Value
	 FROM  orderdetails
	 	GROUP BY productCode;
	 	
-- ceil() & Floor() 
-- The CEIL() function takes an input number and returns 
-- the smallest integer greater than or equal to that number.

-- FLOOR() -Returns the largest integer value not greater than the argument

SELECT FLOOR(59.9), FLOOR(53.3), CEIL(59.1);

SELECT productLine, CEIL(AVG(msrp)) averageMsrp , AVG(msrp) 
	FROM products
		GROUP BY productLine
			ORDER BY averageMsrp;

#Null Related Functions

-- IFNULL()  - Return the specified value IF the expression is NULL, 
-- otherwise return the expression

SELECT IFNULL(NULL, 'Hello'), IFNULL('Java','James'), IFNULL(NULL ,0),IFNULL(220,0);

SELECT customerName, city,state FROM customers;

SELECT customerName, city, IFNULL(state,'No State') FROM customers;

SELECT productLine FROM products WHERE msrp IS NULL;

SELECT AVG(buyPrice) WrongPrice , AVG(IFNULL (buyPrice,0)) PerfectPrice 
	FROM products;

SELECT * FROM payments;


# Conversion functions

-- FORMAT() -- Converts number in to a String
-- DATE_FORMAT() -Converts DATE  in to a String
-- CONVERT()  - Converting String to Number/dATE/TIME

SELECT DATE_FORMAT(NOW(),'%Y %M %m %D %d' ), NOW();  -- formating date

SELECT FORMAT(1002343,2), FORMAT(1002343.235,2);

SELECT CONVERT('100',UNSIGNED INTEGER), CONVERT('-100',SIGNED INTEGER);

SELECT CONVERT('2017-12-31',DATE), CONVERT('08:45:59',TIME);
		
SELECT * FROM employees;

SELECT * FROM offices;


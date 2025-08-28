# SQL Joins
-- A join is a method of linking data between one (self-join) or 
-- more tables based on values of the common column between the tables.

/* MySQL supports the following types of joins:

Inner join
Left join
Right join
Cross join */

-- Inner Join - Returns only matching records from 2 tables

/* SELECT
    select_list
FROM t1
INNER JOIN t2 ON join_condition1
INNER JOIN t3 ON join_condition2
...; */

-- Query to display employeeCode, firstName & city of employees
USE classicmodels;

SELECT * FROM employees;
SELECT * FROM offices;


SELECT employeeNumber, firstName, city FROM employees e
  JOIN offices o
    ON e.officeCode=o.officeCode;


		
-- Query to display productCode and productName from the products table.
-- and  textDescription of product lines from the productlines table.

SELECT productCode, productName, textDescription FROM products p
  INNER JOIN productlines pl
    ON p.productLine=pl.productLine;
    

SELECT productCode, productName, textDescription FROM products
  INNER JOIN productlines
    ON products.productLine=productlines.productLine;   


-- USING clause -  If joined fields of both tables have same name --Natural Join

SELECT employeeNumber, firstName, city, country FROM employees
 INNER JOIN offices USING(officeCode);


# Design a query to display custNo, custName, SalesRepName of the customer

SELECT * FROM customers;
SELECT * FROM employees;

SELECT customerNumber, customerName, CONCAT(firstName, ' ', lastName) 'Sales Rep', email
   FROM customers c
     INNER JOIN employees e
       ON c.salesRepEmployeeNumber=e.employeeNumber;


-- Inner join with group by clause
SELECT * FROM orders;
SELECT * FROM orderdetails;


SELECT t1.status, SUM(quantityOrdered * priceEach) Total
  FROM orders t1
   INNER JOIN orderdetails t2
     ON t1.orderNumber=t2.orderNumber
      GROUP BY t1.`status`;


-- Join 3 Tables
USE classicmodels;

SELECT orderNumber, orderDate,
 orderLineNumber, 
   productName, 
     quantityOrdered, priceEach
       FROM orders INNER JOIN orderdetails
         USING (orderNumber)
           INNER JOIN products
             USING ( productCode)
               ORDER BY orderNumber, orderLineNumber;


-- Joins with operators
-- The following query uses a less-than ( <) join to find sales price of the 
-- product whose code is S10_1678 that is less than the manufacturer’s 
-- suggested retail price (MSRP) for that product.

SELECT * FROM products WHERE productCode='S10_1678';
SELECT * FROM orderdetails WHERE productCode='S10_1678';

SELECT orderNumber, productName, msrp, priceEach FROM products p
  INNER JOIN orderdetails o 
    ON p.productCode = o.productCode
      AND p.MSRP > o.priceEach
        WHERE p.productCode= 'S10_1678'




# lEFT OUTER JOIN
-- LEFT JOIN returns all rows from the left table regardless of whether a row 
-- from the left table has a matching row from the right table or not. 
-- If there is no match, the columns of the row from the right table will contain NULL.

-- This query uses the LEFT JOIN clause to find all customers and their orders:
SELECT * FROM customers;
SELECT * FROM orders;

SELECT c.customerNumber, customerName, orderNumber, IFNULL (STATUS, 'No Orders') status
  FROM customers c 
    LEFT JOIN orders o
      ON c.customerNumber=o.customerNumber ORDER BY STATUS DESC;


-- Left Join to find customers who have no order

SELECT c.customerNumber, c.customerName, o.orderNumber, STATUS FROM customers c 
  LEFT JOIN orders o
    ON c.customerNumber=o.customerNumber
      WHERE orderNumber IS NULL;

-- Query to display All OrderNumbers, and their matching
-- CustomerNo & Prdct Code of 10123

SELECT o.orderNumber, o.customerNumber, d.productCode FROM orders o
   LEFT JOIN orderdetails d
     ON o.orderNumber=d.orderNumber AND o.orderNumber=10123;

		
# RIGHT JOIN
-- RIGHT JOIN returns all rows from the right table regardless of 
-- having matching rows from the left table or not.

-- Query to display all Sales Rep , customer Id & Customer Name 

SELECT c.customerNumber, c.customerName, e.firstName 'Sales Rep'
  FROM customers c 
    RIGHT JOIN employees e 
      ON c.salesRepEmployeeNumber=e.employeeNumber;
      
      
SELECT c.customerNumber, e.employeeNumber
	FROM customers c
		RIGHT  JOIN employees e
			ON c.salesRepEmployeeNumber=e.employeeNumber
				ORDER BY e.employeeNumber;



#Full Outer Join

-- returns all rows from the left table (table1) and from the 
-- right table (table2).
-- MY SQL DOESNOT SUPPORT FULL JOIN.. INSTEAD USE UNION WITH LEFT/RIGHT JOINS

SELECT t1.customerNumber, customerName, orderNumber, status from 
customers t1
		LEFT JOIN orders t2
				ON t1.customerNumber=t2.customerNumber
UNION
			
SELECT c.customerNumber, customerName, orderNumber, status from 
customers c
		RIGHT JOIN orders o
				ON c.customerNumber=o.customerNumber;


#Self Join
-- The self join is often used to query hierarchical data or to compare a row 
-- with other rows within the same table.
-- Joining a table to Itself, by Creating a virtual copy of a Table
USE classicmodels;
SELECT * FROM employees;

SELECT e.employeeNumber, CONCAT(e.firstName, ' ', e.lastName) Employee,
  CONCAT (m.firstName, ' ', m.lastName) AS 'Reports To'
    FROM employees e LEFT JOIN employees m 
      ON e.reportsTo=m.employeeNumber;


# ***************************************************************************

#Sub Query

-- A MySQL subquery is a query that is nested inside another query.
-- A MySQL subquery is called an inner query while the query that contains the 
-- subquery is called an outer query.
-- Sub query acts a criteria for Outer query.
-- Syntax: SELECT * FROM t1 WHERE column1 = (SELECT column1 FROM t2);


# Display Employees who work in Offices located in USA

SELECT * FROM offices;
SELECT * FROM employees;


SELECT employeeNumber, lastName, firstName FROM employees -- Outer Query
  WHERE officeCode
    IN(SELECT officeCode FROM offices WHERE country='USA');  -- Inner Query acts as criteria value	

-- Find customers who have not placed any Orders

SELECT * FROM orders;
SELECT * FROM customers;

SELECT customerNumber, customerName FROM customers
   WHERE customerNumber NOT IN (SELECT DISTINCT customerNumber FROM orders);


-- Display products with price greater than '1958 Setra Bus'

SELECT * FROM products;

SELECT buyPrice FROM products WHERE productName='1958 Setra Bus';

SELECT productName, buyPrice FROM products
  WHERE buyPrice > (SELECT buyPrice FROM products WHERE productName='1958 Setra Bus');


--  find customers whose payments are greater than the average payment

SELECT * FROM payments;

SELECT AVG(amount) FROM payments;

SELECT * FROM payments WHERE amount > (SELECT AVG(amount) FROM payments) 
	ORDER BY amount desc;
	
SELECT p.*,c.customerName FROM payments p INNER JOIN customers c
	ON p.customerNumber=c.customerNumber
	AND amount > (SELECT AVG(amount) FROM payments) 
	ORDER BY amount desc;
	
SELECT p.*,c.customerName FROM payments p INNER JOIN customers c
	USING(customerNumber)
	where amount > (SELECT AVG(amount) FROM payments) 
	ORDER BY amount desc;

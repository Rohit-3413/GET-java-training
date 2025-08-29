#Stored Procedure

/*A stored procedure is a set of Structured Query Language (SQL) statements with an 
assigned name, which are stored in a relational database management system (RDBMS) 
as a group, so it can be reused and shared by multiple programs.

Stored procedures can access or modify data in a database, but it is not tied to a 
specific database or object, which offers a number of advantages.
*/

-- Normally Queries are not saved
-- If you want to save any query on the database server for execution later, one way 
-- to do it is to use a stored procedure.

USE classicmodels;

SELECT 
    customerName, 
    city, 
    state, 
    postalCode, 
    country
FROM
    customers
ORDER BY customerName;

/*The following CREATE PROCEDURE statement creates a new stored procedure that 
 wraps the query above: */

-- Create Stored Procedure
DELIMITER $$
CREATE PROCEDURE getMyCustomers()
   Begin
   
   select
     customerName,
     city,
     state,
     postalCode,
     country
      from
   customers
     ORDER BY customerName;
     
     
     END$$
     
     
DELIMITER ;  -- run this separately

-- Invoke Stored Procedure

CALL getMyCustomers();

-- -----------------------------------------------

SELECT *  FROM employees;
SELECT * FROM offices;


DELIMITER $$
CREATE PROCEDURE getMyEmployees()

BEGIN 


     SELECT e.employeeNumber,CONCAT(lastName,' ',firstName),
	     	email, jobTitle, ofc.city,ofc.country
		      FROM employees e 
			      INNER JOIN offices ofc
			         ON e.officeCode=ofc.officeCode;
			
			
END$$

DELIMITER ;

CALL getMyEmployees();


-- 
/* IN parameters
IN is the default mode. When you define an IN parameter in a stored procedure, 
the calling program has to pass an argument to the stored procedure.*/

-- stored procedure that finds all offices that locate in a country 
-- specified by the input parameter countryName:

DELIMITER //

CREATE PROCEDURE GetOfficeByCountry(IN countryName VARCHAR(255))

BEGIN
   SELECT *
   FROM offices
   WHERE country = countryName;
   
END//

DELIMITER ;

-- call SP with IN parameter

CALL GetOfficeByCountry('USA');

CALL GetOfficeByCountry('France');

CALL GetOfficeByCountry();  -- error


/*OUT parameters
The value of an OUT parameter can be changed inside the stored procedure 
and its new value is passed back to the calling program.

Notice that the stored procedure cannot access the initial value of the 
OUT parameter when it starts.*/

-- stored procedure returns the number of orders by order status.

DELIMITER $$
CREATE PROCEDURE GetOrderCountByStatus (
  IN orderStatus VARCHAR(25),
  OUT total INT
  
)
BEGIN
  SELECT COUNT(orderNumber)
  INTO total
  FROM orders
  WHERE STATUS = orderStatus;
END $$

DELIMITER ;


-- call SP with IN & OUT Parameter
CALL GetOrderCountByStatus('Shipped', @total); -- passing session variable @total
SELECT @total AS TotalShipped;

CALL GetOrderCountByStatus('Cancelled', @total1); -- passing session variable @total
SELECT @total1 AS TotalCancelled;


CALL GetOrderCountByStatus('InProcess', @total2); -- passing session variable @total
SELECT @total2 AS TotalInProcess;

CALL GetOrderCountByStatus('Disputed', @total3); -- passing session variable @total
SELECT @total3 AS TotalDisputed;


/*
 The stored procedure SetCounter() accepts one INOUT parameter ( counter ) 
 and one IN parameter ( inc ). 
 It increases the counter ( counter ) by the value specified by the inc parameter.*/
 
 -- The INOUT parameter
 DELIMITER $$
 CREATE PROCEDURE SetCounter(
 	INOUT counter INT,
 	IN inc INT
)
BEGIN
	SET counter = counter + inc;
END$$

DELIMITER;

-- call the SetCounter SP:

SET @counter = 1;
CALL SetCounter(@counter,1); -- 2
SELECT @counter;

CALL SetCounter(@counter,1); -- 3
SELECT @counter;

CALL SetCounter(@counter,5); -- 8
SELECT @counter; -- 8



-- Listing Stored Procedures

-- Shows all stored procedures in the current MySQL server:
SHOW PROCEDURE STATUS;

-- lists all stored procedures in the sample database classicmodels:
SHOW PROCEDURE STATUS WHERE db = 'classicmodels';
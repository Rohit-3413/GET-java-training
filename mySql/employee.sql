create database employeedb;
use  employeedb;

CREATE TABLE IF NOT EXISTS `employees` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

 INSERT INTO `employees` (`id`, `name`, `password`, `email`, `sex`, `country`) VALUES
(17, 'arun', 'kumar', 'arun@gmail.com', 'Male', 'India'),
(19, 'john', 'micheal', 'john@coforge.com', 'male', 'India'),
(20, 'Mike', 'khan', 'mike@test.com', 'male', 'India');

SELECT * FROM employees;
-- Create DB

CREATE DATABASE adatba
COLLATE utf8_hungarian_ci
CHARACTER SET utf8;

-- Create user

GRANT ALL PRIVILEGES 
ON adatba
TO adatba@localhost
IDENTIFIED BY 'titok';

-- Create table

CREATE TABLE employees (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  city VARCHAR(50),
  salary DOUBLE 
);
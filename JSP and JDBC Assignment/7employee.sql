USE db;
CREATE TABLE employee (
    empid INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    desg VARCHAR(50),
    salary DECIMAL(10,2)
);
INSERT INTO employee (empid, name, age, desg, salary) VALUES
(101, 'Raghav Jha', 30, 'Manager', 65000.00),
(102, 'Priya Das', 25, 'Developer', 40000.00),
(103, 'Amit Singh', 28, 'Tester', 35000.00),
(104, 'Sneha Roy', 26, 'Developer', 42000.00),
(105, 'Arjun Mehta', 32, 'Team Lead', 55000.00);
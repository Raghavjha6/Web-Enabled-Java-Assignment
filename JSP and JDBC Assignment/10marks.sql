USE db;
CREATE TABLE marks (
    regno INT PRIMARY KEY,
    name VARCHAR(100),
    math INT,
    java INT,
    dbms INT
);
INSERT INTO marks (regno, name, math, java, dbms) VALUES
(1001, 'Raghav Jha', 85, 90, 92),
(1002, 'Priya Sharma', 90, 88, 80),
(1003, 'Amit Verma', 70, 65, 75),
(1004, 'Sneha Roy', 95, 92, 89),
(1005, 'Arjun Mehta', 60, 72, 68);
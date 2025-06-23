# Write your MySQL query statement below
SELECT e.name, b.bonus from employee E LEFT JOIN bonus b ON e.empId = b.empId where bonus < 1000 or bonus is null;
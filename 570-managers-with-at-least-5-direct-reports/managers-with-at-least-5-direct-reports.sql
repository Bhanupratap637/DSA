# Write your MySQL query statement below
SELECT e.name from employee e join employee e1 on e.id = e1.managerId group by e1.managerId having 5 <= count(e1.managerId);
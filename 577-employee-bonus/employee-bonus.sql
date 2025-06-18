# Write your MySQL query statement below
Select name, bonus from employee e left join bonus b on e.empID = b.empID where bonus<1000 or bonus is null;
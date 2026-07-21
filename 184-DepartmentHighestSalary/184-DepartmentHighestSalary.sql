-- Last updated: 7/21/2026, 9:01:03 AM
# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary
FROM Employee e
JOIN Department d 
ON e.departmentId = d.id
WHERE (e.departmentId, e.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);
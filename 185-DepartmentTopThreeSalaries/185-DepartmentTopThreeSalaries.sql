-- Last updated: 7/21/2026, 9:01:02 AM
# Write your MySQL query statement below
SELECT 
    d.name AS Department,
    e.name AS Employee,
    e.salary
FROM (
    SELECT *,
           DENSE_RANK() OVER (
               PARTITION BY departmentId 
               ORDER BY salary DESC
           ) AS rnk
    FROM Employee
) e
JOIN Department d
ON e.departmentId = d.id
WHERE rnk <= 3;
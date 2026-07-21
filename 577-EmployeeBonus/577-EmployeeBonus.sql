-- Last updated: 7/21/2026, 9:00:13 AM
# Write your MySQL query statement below
SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus IS NULL
OR b.bonus < 1000;
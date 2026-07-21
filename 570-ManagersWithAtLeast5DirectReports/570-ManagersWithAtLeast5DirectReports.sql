-- Last updated: 7/21/2026, 9:00:14 AM
# Write your MySQL query statement below
SELECT m.name
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
GROUP BY m.id, m.name
HAVING COUNT(e.id) >= 5;
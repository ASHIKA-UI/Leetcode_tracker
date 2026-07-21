-- Last updated: 7/21/2026, 8:58:27 AM
# Write your MySQL query statement below
SELECT employee_id,
CASE
    WHEN employee_id % 2 = 1 AND name NOT LIKE 'M%' THEN salary
    ELSE 0
END AS bonus
FROM Employees
ORDER BY employee_id ASC;
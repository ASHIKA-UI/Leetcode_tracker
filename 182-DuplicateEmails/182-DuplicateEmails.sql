-- Last updated: 7/21/2026, 9:01:05 AM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
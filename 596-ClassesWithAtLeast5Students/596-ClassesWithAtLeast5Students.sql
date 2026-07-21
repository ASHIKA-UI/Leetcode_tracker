-- Last updated: 7/21/2026, 9:00:06 AM
# Write your MySQL query statement below
SELECT 
    class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;
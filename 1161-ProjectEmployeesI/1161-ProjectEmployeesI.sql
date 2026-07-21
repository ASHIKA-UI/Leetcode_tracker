-- Last updated: 7/21/2026, 8:59:24 AM
# Write your MySQL query statement below
SELECT
 p.project_id,
 ROUND(AVG(experience_years),2) AS average_years
FROM project P
LEFT JOIN employee e
ON p.employee_id = e.employee_id 
GROUP BY p.project_id;
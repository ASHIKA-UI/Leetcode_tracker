-- Last updated: 7/21/2026, 8:59:59 AM
# Write your MySQL query statement below
SELECT 
    x, 
    y, 
    z,
    CASE 
        WHEN x + y > z 
         AND x + z > y 
         AND y + z > x 
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;
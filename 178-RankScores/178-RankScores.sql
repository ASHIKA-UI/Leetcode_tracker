-- Last updated: 7/21/2026, 9:01:11 AM
# Write your MySQL query statement below
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;
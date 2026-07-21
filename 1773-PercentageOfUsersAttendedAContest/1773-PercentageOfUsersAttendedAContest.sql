-- Last updated: 7/21/2026, 8:58:34 AM
# Write your MySQL query statement below
SELECT 
    contest_id,
    ROUND(
        COUNT(user_id) * 100.0 / (SELECT COUNT(*) FROM Users),
        2
    ) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;
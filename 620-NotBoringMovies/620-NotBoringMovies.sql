-- Last updated: 7/21/2026, 8:59:56 AM
# Write your MySQL query statement below
SELECT id, movie, description, rating
FROM cinema
WHERE id % 2 != 0
AND description != 'boring'
ORDER BY rating DESC;
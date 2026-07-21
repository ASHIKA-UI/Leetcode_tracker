-- Last updated: 7/21/2026, 9:00:11 AM
# Write your MySQL query statement below
SELECT name
FROM customer
WHERE referee_id != 2 
OR referee_id  IS NULL;
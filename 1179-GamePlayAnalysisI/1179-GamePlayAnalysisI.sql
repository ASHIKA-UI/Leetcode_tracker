-- Last updated: 7/21/2026, 8:59:22 AM
# Write your MySQL query statement below
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
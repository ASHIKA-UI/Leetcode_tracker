-- Last updated: 7/21/2026, 8:58:30 AM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;
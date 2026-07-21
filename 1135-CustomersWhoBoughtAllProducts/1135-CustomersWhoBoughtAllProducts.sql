-- Last updated: 7/21/2026, 8:59:30 AM
 # Write your MySQL query statement below
SELECT customer_id 
FROM Customer
GROUP BY customer_id 
HAVING COUNT(DISTINCT product_key ) = (SELECT COUNT(*) FROM Product);
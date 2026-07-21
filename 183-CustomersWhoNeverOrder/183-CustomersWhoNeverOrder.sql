-- Last updated: 7/21/2026, 9:01:06 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT name AS Customers 
FROM Customers  
WHERE id NOT IN (
    SELECT customerId FROM Orders 
);
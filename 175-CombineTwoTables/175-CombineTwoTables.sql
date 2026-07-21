-- Last updated: 7/21/2026, 9:01:15 AM
# Write your MySQL query statement below
SELECT 
    Person.FirstName, 
    Person.LastName, 
    Address.City, 
    Address.State
FROM Person
LEFT JOIN Address
ON Person.PersonId = Address.PersonId;
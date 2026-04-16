1# Write your MySQL query statement below
2select class from courses
3group by class
4having count(student)>=5;
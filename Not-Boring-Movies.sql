1# Write your MySQL query statement below
2select * from cinema
3where MOD(id,2)!=0 and description!='boring'
4order by rating desc;
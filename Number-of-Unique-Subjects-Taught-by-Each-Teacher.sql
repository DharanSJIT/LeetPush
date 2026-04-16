1# Write your MySQL query statement below
2select teacher_id,count(distinct subject_id) as cnt
3from teacher
4group by teacher_id;
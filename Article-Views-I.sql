1# Write your MySQL query statement below
2select author_id as id
3from views
4where author_id=viewer_id
5group by author_id
6order by author_id;
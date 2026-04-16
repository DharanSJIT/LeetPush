1# Write your MySQL query statement below
2select tweet_id 
3from tweets
4where char_length(content)>15;
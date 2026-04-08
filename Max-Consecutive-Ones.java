1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3       int n=nums.length;
4       int count=0;
5       int max=0;
6       for(int i=0;i<n;i++){
7            if(nums[i]==1){
8                count++;
9                max=Math.max(max,count);
10            }
11            else count=0;
12       } 
13       return max;
14    }
15}
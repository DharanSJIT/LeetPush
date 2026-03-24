1class Solution {
2    public int[] runningSum(int[] nums) {
3        int[] res=new int[nums.length];
4        int n=nums.length;
5        res[0]=nums[0];
6        for(int i=1;i<n;i++){
7            res[i]=nums[i]+res[i-1];
8        }
9        return res;
10    }
11}
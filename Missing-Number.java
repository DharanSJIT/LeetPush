1class Solution {
2    public int missingNumber(int[] nums) {
3       int n=nums.length;
4       int count=0;
5       int count1=0;
6       for(int i=0;i<n;i++){
7            count+=i;
8            count1+=nums[i];
9       }
10       count+=n;
11       return count-count1;
12    }
13}
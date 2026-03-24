1class Solution {
2    public int missingNumber(int[] nums) {
3       int n=nums.length;
4       int count=0;
5       int count1=0;
6       for(int i=0;i<n+1;i++){
7            count+=i;
8       }
9       for(int i=0;i<n;i++){
10           count1+=nums[i];
11       }
12       return count-count1;
13    }
14}
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int maxsum=sum;
8        for(int i=k;i<nums.length;i++){
9            sum+=nums[i]-nums[i-k];
10            maxsum=Math.max(sum,maxsum);
11        }
12        return (double)maxsum/k;
13    }
14}
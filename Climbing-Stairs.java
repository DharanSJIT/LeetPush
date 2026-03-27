1class Solution {
2    public int climbStairs(int n) {
3        int[] dp=new int[n];
4        dp[0]=1;
5        if(n>=2){
6            dp[1]=2;
7        }
8        for(int i=2;i<n;i++){
9            dp[i]=dp[i-1]+dp[i-2];
10        }
11        return dp[n-1];
12    }
13    
14}
1class Solution {
2    public int fib(int n) {
3        int[] dp=new int[n+1];
4       
5        if(n<=1) return n;
6        if(n>=2){
7             dp[0]=0;
8             dp[1]=1;
9        }
10        for(int i=2;i<=n;i++){
11            dp[i]=dp[i-1]+dp[i-2];
12        }
13        return dp[n];
14    }
15}
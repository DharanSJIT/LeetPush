1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        for(int i=1;i<prices.length;i++){
5            profit+= Math.max(0,(prices[i]-prices[i-1]));
6        }
7        return profit;
8    }
9}
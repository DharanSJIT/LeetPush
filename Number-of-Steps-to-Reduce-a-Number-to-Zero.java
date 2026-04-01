1class Solution {
2    public int numberOfSteps(int num) {
3       if(num==0) return 0;
4       if(num%2==0) return 1+numberOfSteps(num/2);
5       return 1+numberOfSteps(num-1); 
6    }
7}
1class Solution {
2    public int fib(int n) {
3      if(n<=1) return n;
4      return fib(n-1)+fib(n-2); 
5    }
6}
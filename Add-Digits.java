1class Solution {
2    public int addDigits(int num) {
3        if(num==0) return 0;
4        return (num%9==0) ? 9 : (num%9);
5    }
6}
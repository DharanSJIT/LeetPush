1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        char[] str1=jewels.toCharArray();
4        char[] str2=stones.toCharArray();
5        int count=0;
6        for(int i=0;i<str1.length;i++){
7            for(int j=0;j<str2.length;j++){
8                if(str1[i]==str2[j]){
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15}
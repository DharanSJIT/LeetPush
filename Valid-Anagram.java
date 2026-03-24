1class Solution {
2    public boolean isAnagram(String s, String t) {
3      int n1=s.length();
4      int n2=t.length();
5      char[] ch1=s.toCharArray();
6      Arrays.sort(ch1);
7      char[] ch2=t.toCharArray();
8      Arrays.sort(ch2);
9      if(Arrays.equals(ch1,ch2)){
10        return true;
11      }
12      return false;
13    }
14}
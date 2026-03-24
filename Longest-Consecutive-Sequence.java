1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int num : nums){
5            set.add(num);
6        } 
7        int longest=0;
8        for(int num : set){
9            if(!set.contains(num-1)){
10                int currnum=num;
11                int count=1;
12                while(set.contains(currnum+1)){
13                    currnum++;
14                    count++;
15                }
16                longest=Math.max(longest,count);
17            }
18        }
19        return longest;
20    }
21}
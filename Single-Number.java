1class Solution {
2    public int singleNumber(int[] nums) {
3      HashMap<Integer,Integer> freq=new HashMap<>();
4      for(int num : nums){
5        freq.put(num,freq.getOrDefault(num,0)+1);
6      }
7      for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
8        if(entry.getValue()==1){
9            return entry.getKey();
10        }
11      }
12      return -1;
13    }
14}
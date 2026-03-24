1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> res=new ArrayList<>();
4        HashMap<Integer,Integer> freq=new HashMap<>();
5        for(int num : nums){
6            freq.put(num,freq.getOrDefault(num,0)+1);
7        }
8        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
9            if(entry.getValue()>=2){
10                res.add(entry.getKey());
11            }
12        }
13        return res;
14    }
15}
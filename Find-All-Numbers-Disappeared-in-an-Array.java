1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> res=new ArrayList<>();
4        HashSet<Integer> set=new HashSet<>();
5        for(int num : nums) set.add(num);
6        for(int i=1;i<=nums.length;i++){
7            if(!set.contains(i)){
8                res.add(i);
9            }
10        }
11        return res;
12    }
13}
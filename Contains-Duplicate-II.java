1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(i>k){
6                set.remove(nums[i-k-1]);
7            }
8            if(set.contains(nums[i])){
9                return true;
10            }
11            set.add(nums[i]);
12        }
13        return false;
14    }
15}
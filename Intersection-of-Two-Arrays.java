1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1=new HashSet<>();
4        HashSet<Integer> set2=new HashSet<>();
5        for(int num : nums1) set1.add(num);
6        for(int num : nums2) set2.add(num);
7        set1.retainAll(set2);
8        int[] res=new int[set1.size()];
9        int i=0;
10        for(int num : set1){
11            res[i++]=num;
12        }
13        return res;
14    }
15}
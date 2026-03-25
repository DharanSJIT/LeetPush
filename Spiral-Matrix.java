1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans=new ArrayList<>();
4        int top=0;
5        int left=0;
6        int bottom=matrix.length-1;
7        int right=matrix[0].length-1;
8        while(top<=bottom && left<=right){
9            for(int i=left;i<=right;i++){
10                ans.add(matrix[top][i]);
11            }
12            top++;
13            for(int j=top;j<=bottom;j++){
14                ans.add(matrix[j][right]);
15            }
16            right--;
17            if(top<=bottom){
18                for(int i=right;i>=left;i--){
19                    ans.add(matrix[bottom][i]);
20                }
21
22            }
23            bottom--;
24            if(left<=right){
25                for(int j=bottom;j>=top;j--){
26                    ans.add(matrix[j][left]);
27                }
28            }
29            left++;
30        }
31        return ans;
32
33    }
34}
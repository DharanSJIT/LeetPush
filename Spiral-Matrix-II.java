1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] mat=new int[n][n];
4        int top = 0;
5        int left = 0;
6        int bottom =mat.length-1;
7        int right =mat[0].length-1;
8        int temp=1;
9        while (top <= bottom && left <= right) {
10            for (int i = left; i <= right; i++) {
11                mat[top][i]=temp;
12                temp++;
13            }
14            top++;
15            for (int j = top; j <= bottom; j++) {
16                mat[j][right]=temp;
17                temp++;
18            }
19            right--;
20            if (top <= bottom) {
21                for (int i = right; i >= left; i--) {
22                    mat[bottom][i]=temp;
23                temp++;
24                }
25
26            }
27            bottom--;
28            if (left <= right) {
29                for (int j = bottom; j >= top; j--) {
30                   mat[j][left]=temp;
31                temp++;
32                }
33            }
34            left++;
35        }
36        return mat;
37
38    }
39}
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3       int rows=grid.length;
4       int col=grid[0].length;
5       int count=0;
6       for(int i=0;i<rows;i++){
7        for(int j=0;j<col;j++){
8            if(grid[i][j]==1){
9                count+=4;
10                if(i>0 && grid[i-1][j]==1){
11                    count-=2;
12                }
13                if(j>0 && grid[i][j-1]==1){
14                    count-=2;
15                }
16            }
17        }
18       } 
19       return count;
20    }
21}
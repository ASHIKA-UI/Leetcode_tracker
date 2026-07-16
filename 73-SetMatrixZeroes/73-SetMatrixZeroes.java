// Last updated: 7/16/2026, 10:34:08 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        boolean firstRow = false, firstCol = false;
5
6        
7        for (int j = 0; j < n; j++)
8            if (matrix[0][j] == 0) firstRow = true;
9
10        
11        for (int i = 0; i < m; i++)
12            if (matrix[i][0] == 0) firstCol = true;
13
14        
15        for (int i = 1; i < m; i++) {
16            for (int j = 1; j < n; j++) {
17                if (matrix[i][j] == 0) {
18                    matrix[i][0] = 0;
19                    matrix[0][j] = 0;
20                }
21            }
22        }
23
24        
25        for (int i = 1; i < m; i++) {
26            for (int j = 1; j < n; j++) {
27                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
28                    matrix[i][j] = 0;
29                }
30            }
31        }
32
33       
34        if (firstRow) {
35            for (int j = 0; j < n; j++) matrix[0][j] = 0;
36        }
37
38        
39        if (firstCol) {
40            for (int i = 0; i < m; i++) matrix[i][0] = 0;
41        }
42    }
43}
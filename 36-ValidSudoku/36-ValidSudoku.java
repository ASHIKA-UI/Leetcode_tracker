// Last updated: 7/24/2026, 10:03:38 AM
1import java.util.*;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5        
6        HashSet<Character>[] rows = new HashSet[9];
7        HashSet<Character>[] cols = new HashSet[9];
8        HashSet<Character>[] boxes = new HashSet[9];
9        
10        for (int i = 0; i < 9; i++) {
11            rows[i] = new HashSet<>();
12            cols[i] = new HashSet<>();
13            boxes[i] = new HashSet<>();
14        }
15
16        for (int i = 0; i < 9; i++) {
17            for (int j = 0; j < 9; j++) {
18                
19                char val = board[i][j];
20                
21                if (val == '.') continue;
22
23                int boxIndex = (i / 3) * 3 + (j / 3);
24
25                // check duplicate
26                if (rows[i].contains(val) || 
27                    cols[j].contains(val) || 
28                    boxes[boxIndex].contains(val)) {
29                    return false;
30                }
31
32                // add value
33                rows[i].add(val);
34                cols[j].add(val);
35                boxes[boxIndex].add(val);
36            }
37        }
38
39        return true;
40    }
41}
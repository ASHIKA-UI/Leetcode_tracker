// Last updated: 7/15/2026, 1:45:05 PM
1import java.util.*;
2
3class Solution {
4
5    public static List<Integer> getRow(int rowIndex) {
6
7        List<List<Integer>> res = new ArrayList<>();
8
9        for (int i = 0; i <= rowIndex; i++) {
10
11            List<Integer> row = new ArrayList<>();
12            row.add(1);
13
14            for (int j = 1; j < i; j++) {
15                int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);
16                row.add(val);
17            }
18
19            if (i > 0)
20                row.add(1);
21
22            res.add(row);
23        }
24
25        return res.get(rowIndex);
26    }
27
28    public static void main(String[] args) {
29
30            int rowIndex = 3;  
31
32            List<Integer> row = getRow(rowIndex);
33
34            System.out.println(row);
35    }
36}
37
// Last updated: 7/20/2026, 11:12:56 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        // Edge case
4        if (numRows == 1 || s.length() <= numRows) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new StringBuilder();
11        }
12
13        int currentRow = 0;
14        boolean goingDown = false;
15
16        for (char c : s.toCharArray()) {
17            rows[currentRow].append(c);
18
19            // Change direction at top or bottom
20            if (currentRow == 0 || currentRow == numRows - 1) {
21                goingDown = !goingDown;
22            }
23
24            currentRow += goingDown ? 1 : -1;
25        }
26
27        // Combine all rows
28        StringBuilder result = new StringBuilder();
29        for (StringBuilder row : rows) {
30            result.append(row);
31        }
32
33        return result.toString();
34    }
35}
// Last updated: 7/22/2026, 11:04:40 AM
1import java.util.*;
2
3class Solution {
4    public List<String> letterCombinations(String digits) {
5        List<String> result = new ArrayList<>();
6        
7        if (digits == null || digits.length() == 0) {
8            return result;
9        }
10
11        String[] map = {
12            "",     // 0
13            "",     // 1
14            "abc",  // 2
15            "def",  // 3
16            "ghi",  // 4
17            "jkl",  // 5
18            "mno",  // 6
19            "pqrs", // 7
20            "tuv",  // 8
21            "wxyz"  // 9
22        };
23
24        backtrack(result, digits, map, 0, new StringBuilder());
25        return result;
26    }
27
28    private void backtrack(List<String> result, String digits, String[] map, int index, StringBuilder current) {
29        if (index == digits.length()) {
30            result.add(current.toString());
31            return;
32        }
33
34        String letters = map[digits.charAt(index) - '0'];
35
36        for (char ch : letters.toCharArray()) {
37            current.append(ch);
38            backtrack(result, digits, map, index + 1, current);
39            current.deleteCharAt(current.length() - 1); // backtrack
40        }
41    }
42}
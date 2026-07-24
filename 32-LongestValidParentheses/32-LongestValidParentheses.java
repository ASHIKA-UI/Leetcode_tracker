// Last updated: 7/24/2026, 9:41:52 AM
1import java.util.*;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(-1); // base for length calculation
7        int maxLength = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10            if (s.charAt(i) == '(') {
11                stack.push(i);
12            } else {
13                stack.pop();
14
15                if (stack.isEmpty()) {
16                    stack.push(i); // reset base
17                } else {
18                    maxLength = Math.max(maxLength, i - stack.peek());
19                }
20            }
21        }
22
23        return maxLength;
24    }
25}
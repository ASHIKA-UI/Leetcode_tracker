// Last updated: 7/22/2026, 11:18:01 AM
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0, n = s.length();
4        
5        // 1. Skip leading whitespace
6        while (i < n && s.charAt(i) == ' ') {
7            i++;
8        }
9        
10        // 2. Handle sign
11        int sign = 1;
12        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
13            if (s.charAt(i) == '-') sign = -1;
14            i++;
15        }
16        
17        // 3. Convert digits
18        int result = 0;
19        
20        while (i < n && Character.isDigit(s.charAt(i))) {
21            int digit = s.charAt(i) - '0';
22            
23            // 4. Handle overflow BEFORE multiplying
24            if (result > (Integer.MAX_VALUE - digit) / 10) {
25                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
26            }
27            
28            result = result * 10 + digit;
29            i++;
30        }
31        
32        return result * sign;
33    }
34}
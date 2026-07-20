// Last updated: 7/20/2026, 11:07:10 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) return "";
4        
5        int start = 0, end = 0;
6        
7        for (int i = 0; i < s.length(); i++) {
8            int len1 = expand(s, i, i);       // odd length
9            int len2 = expand(s, i, i + 1);   // even length
10            
11            int len = Math.max(len1, len2);
12            
13            if (len > end - start) {
14                start = i - (len - 1) / 2;
15                end = i + len / 2;
16            }
17        }
18        
19        return s.substring(start, end + 1);
20    }
21    
22    private int expand(String s, int left, int right) {
23        while (left >= 0 && right < s.length() 
24               && s.charAt(left) == s.charAt(right)) {
25            left--;
26            right++;
27        }
28        return right - left - 1;
29    }
30}
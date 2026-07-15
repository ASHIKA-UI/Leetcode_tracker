// Last updated: 7/15/2026, 1:57:24 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] a = s.toCharArray();
4        char[] b = t.toCharArray();
5
6        Arrays.sort(a);
7        Arrays.sort(b);
8        return Arrays.equals(a,b);
9    }
10  
11
12}
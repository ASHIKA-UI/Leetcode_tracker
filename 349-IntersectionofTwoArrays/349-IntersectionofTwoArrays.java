// Last updated: 7/15/2026, 1:51:04 PM
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5
6        HashSet<Integer> set1 = new HashSet<>();
7        HashSet<Integer> res = new HashSet<>();
8
9    
10        for (int x : nums1) {
11            set1.add(x);
12        }
13
14      
15        for (int x : nums2) {
16            if (set1.contains(x)) {
17                res.add(x);
18            }
19        }
20
21
22        int[] ans = new int[res.size()];
23        int i = 0;
24        for (int x : res) {
25            ans[i++] = x;
26        }
27
28        return ans;
29    }
30}
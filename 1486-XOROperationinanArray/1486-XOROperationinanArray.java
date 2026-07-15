// Last updated: 7/15/2026, 2:06:27 PM
1class Solution {
2    public int xorOperation(int n, int start) {
3
4        int nums = 0;
5
6        for (int i = 0; i < n; i++) {
7
8            int value = start + 2 * i;
9
10            nums = nums ^ value;
11        }
12
13        return nums;
14    }
15}
16
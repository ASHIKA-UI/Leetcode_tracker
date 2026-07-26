// Last updated: 7/26/2026, 9:02:55 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if (s > 9 * n) return -1;
4        if (s == 0) return 0;
5
6        StringBuilder res = new StringBuilder();
7        for (int i = 0; i < n; i++) {
8            int d = Math.min(9, s);
9            res.append(d);
10            s -= d;
11        }
12        return Integer.parseInt(res.toString());
13    }
14}
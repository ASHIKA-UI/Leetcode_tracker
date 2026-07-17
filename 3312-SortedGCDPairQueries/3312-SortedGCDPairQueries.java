// Last updated: 7/17/2026, 2:58:54 PM
1import java.util.*;
2
3class Solution {
4    public int[] gcdValues(int[] nums, long[] queries) {
5        int max = 0;
6        for (int x : nums) max = Math.max(max, x);
7
8        // Step 1: frequency
9        int[] freq = new int[max + 1];
10        for (int x : nums) freq[x]++;
11
12        // Step 2: count numbers divisible by g
13        int[] cnt = new int[max + 1];
14        for (int g = 1; g <= max; g++) {
15            for (int m = g; m <= max; m += g) {
16                cnt[g] += freq[m];
17            }
18        }
19
20        // Step 3: count pairs divisible by g
21        long[] pairs = new long[max + 1];
22        for (int g = 1; g <= max; g++) {
23            pairs[g] = (long) cnt[g] * (cnt[g] - 1) / 2;
24        }
25
26        // Step 4: inclusion-exclusion (exact gcd = g)
27        for (int g = max; g >= 1; g--) {
28            for (int m = 2 * g; m <= max; m += g) {
29                pairs[g] -= pairs[m];
30            }
31        }
32
33        // Step 5: build prefix array
34        List<Long> prefix = new ArrayList<>();
35        List<Integer> values = new ArrayList<>();
36
37        long sum = 0;
38        for (int g = 1; g <= max; g++) {
39            if (pairs[g] > 0) {
40                sum += pairs[g];
41                prefix.add(sum);
42                values.add(g);
43            }
44        }
45
46        // Step 6: answer queries
47        int[] res = new int[queries.length];
48        for (int i = 0; i < queries.length; i++) {
49            long q = queries[i];
50
51            int idx = upperBound(prefix, q);
52            res[i] = values.get(idx);
53        }
54
55        return res;
56    }
57
58    // Binary search: first index where prefix > target
59    private int upperBound(List<Long> arr, long target) {
60        int left = 0, right = arr.size() - 1, ans = arr.size() - 1;
61        while (left <= right) {
62            int mid = (left + right) / 2;
63            if (arr.get(mid) > target) {
64                ans = mid;
65                right = mid - 1;
66            } else {
67                left = mid + 1;
68            }
69        }
70        return ans;
71    }
72}
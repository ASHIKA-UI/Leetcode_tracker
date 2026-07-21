// Last updated: 7/21/2026, 8:58:05 AM
import java.util.*;

class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        // Step 1: frequency
        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        // Step 2: count numbers divisible by g
        int[] cnt = new int[max + 1];
        for (int g = 1; g <= max; g++) {
            for (int m = g; m <= max; m += g) {
                cnt[g] += freq[m];
            }
        }

        // Step 3: count pairs divisible by g
        long[] pairs = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            pairs[g] = (long) cnt[g] * (cnt[g] - 1) / 2;
        }

        // Step 4: inclusion-exclusion (exact gcd = g)
        for (int g = max; g >= 1; g--) {
            for (int m = 2 * g; m <= max; m += g) {
                pairs[g] -= pairs[m];
            }
        }

        // Step 5: build prefix array
        List<Long> prefix = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        long sum = 0;
        for (int g = 1; g <= max; g++) {
            if (pairs[g] > 0) {
                sum += pairs[g];
                prefix.add(sum);
                values.add(g);
            }
        }

        // Step 6: answer queries
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long q = queries[i];

            int idx = upperBound(prefix, q);
            res[i] = values.get(idx);
        }

        return res;
    }

    // Binary search: first index where prefix > target
    private int upperBound(List<Long> arr, long target) {
        int left = 0, right = arr.size() - 1, ans = arr.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr.get(mid) > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
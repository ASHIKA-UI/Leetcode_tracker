// Last updated: 7/21/2026, 9:00:36 AM
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (n % factor == 0) {
                n = n / factor;
            }
        }

        return n == 1;
    }
}
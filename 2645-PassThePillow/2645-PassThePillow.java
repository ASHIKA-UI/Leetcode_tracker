// Last updated: 7/21/2026, 8:58:13 AM
class Solution {
    public int passThePillow(int n, int time) {

        int cycle = 2 * (n - 1);
        int t = time % cycle;

        if (t < n)
            return t + 1;
        else
            return 2 * n - t - 1;
    }
}

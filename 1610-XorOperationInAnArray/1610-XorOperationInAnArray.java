// Last updated: 7/21/2026, 8:58:38 AM
class Solution {
    public int xorOperation(int n, int start) {

        int nums = 0;

        for (int i = 0; i < n; i++) {

            int value = start + 2 * i;

            nums = nums ^ value;
        }

        return nums;
    }
}

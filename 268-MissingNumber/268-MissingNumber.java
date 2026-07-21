// Last updated: 7/21/2026, 9:00:34 AM
class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}
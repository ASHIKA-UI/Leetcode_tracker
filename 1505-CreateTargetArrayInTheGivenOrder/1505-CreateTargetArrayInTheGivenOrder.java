// Last updated: 7/21/2026, 8:58:46 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int pos = index[i];
            int val = nums[i];

            for (int j = target.length - 1; j > pos; j--) {
                target[j] = target[j - 1];
            }

            target[pos] = val;
        }

        return target;
    }
}

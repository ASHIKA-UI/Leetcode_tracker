// Last updated: 7/21/2026, 8:58:40 AM
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];  
        }
        return nums;  
    }
}
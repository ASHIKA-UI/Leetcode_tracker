// Last updated: 7/21/2026, 8:59:38 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int curMax = 0;
        int minSum = nums[0];
        int curMin = 0;

        for (int n : nums) {
            totalSum += n;
            curMax = Math.max(n, curMax + n);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(n, curMin + n);
            minSum = Math.min(minSum, curMin);
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {5, -3, 5};

        int result = solution.maxSubarraySumCircular(nums);

        System.out.println(result);
    }

}

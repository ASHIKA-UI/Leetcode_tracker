// Last updated: 7/21/2026, 8:58:23 AM
class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];      
            ans[i + n] = nums[i];  
        }

        return ans;
    }
}

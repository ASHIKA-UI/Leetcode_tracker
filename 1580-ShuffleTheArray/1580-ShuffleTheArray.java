// Last updated: 7/21/2026, 8:58:41 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            ans[k++] = nums[i];   
            ans[k++] = nums[i+n];  
        }

        return ans;
    }
}
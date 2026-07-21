// Last updated: 7/21/2026, 9:01:33 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;           
        for (int num : nums) {
            result ^= num;
        }
        return result;            
    }
}
// Last updated: 7/21/2026, 8:58:02 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            int currentnum = nums[n - 1 - i];

            if(mul > 1){
                sum += (long) currentnum * mul;
            }else{
                sum += currentnum;
            }
            mul--;
        }
        return sum;
    }
}
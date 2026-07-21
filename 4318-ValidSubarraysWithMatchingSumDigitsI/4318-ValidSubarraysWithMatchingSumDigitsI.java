// Last updated: 7/21/2026, 8:58:01 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            long currentSum = 0;
            for(int j = i; j < n; j++){
                currentSum += nums[j];

                if(isValid(currentSum, x)){
                    count ++;
                }
            }
        }
        return count;  
    }
    private boolean isValid(long sum, int x){
        long val = Math.abs(sum);

        if(val % 10 != x){
            return false;
        }

        long firstDigit = val;
        while(firstDigit >= 10){
            firstDigit /= 10;
        }
        return firstDigit == x;
    }
}
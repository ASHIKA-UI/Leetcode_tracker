// Last updated: 7/21/2026, 8:58:04 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = 0;
        int totalsum = 0;
        int[] range = new int[nums.length];

        for(int i = 0;i < nums.length; i++){
            int currentrange = getDigitRange(nums[i]);
            range[i] = currentrange;
            if(currentrange > maxRange){
                maxRange = currentrange;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(range[i] == maxRange){
                totalsum += nums[i];
            }
        }
        return totalsum;
    }

        private int getDigitRange(int n){
            if(n==0) return 0;
            int min = 9, max = 0;
            n = Math.abs(n);
            while(n>0){
                int digit = n % 10;
                if(digit < min) min =digit;
                if(digit > max) max = digit;
                n /= 10;
            }
            return max - min;
     }
           
}
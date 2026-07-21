// Last updated: 7/21/2026, 9:01:21 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n ; i++){
            if(i == 0){
                if(n == 1|| nums[i] > nums[i + 1]){return i;}
            }else if(i == n - 1){
                if(nums[i] > nums[i - 1]){return i;}
            }else if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){return i;}
        }
        return -1;


  }
}

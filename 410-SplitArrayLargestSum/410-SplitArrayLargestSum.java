// Last updated: 7/21/2026, 9:00:20 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        
        // Find max and sum
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        
        int result = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                result = mid;
                high = mid - 1; // try smaller
            } else {
                low = mid + 1; // increase
            }
        }
        
        return result;
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            if (currentSum > maxSum) {
                count++; // new subarray
                currentSum = num;
                
                if (count > k) return false;
            }
        }
        
        return true;
    }
}
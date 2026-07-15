// Last updated: 7/15/2026, 1:55:17 PM
1public class Solution {
2    public static int searchInsert(int[] nums, int target) {
3       int low = 0;
4       int high = nums.length - 1;
5       
6       while(low <= high){
7        int mid = (low+high)/2;
8
9        if(nums[mid] == target){
10            return mid;
11        }else if(nums[mid] < target){
12            low = mid + 1;
13        }else{
14            high = mid - 1;
15        }
16       }
17       return low;
18    }
19}
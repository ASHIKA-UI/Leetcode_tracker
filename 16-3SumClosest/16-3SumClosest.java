// Last updated: 7/21/2026, 9:11:39 AM
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        int closestSum = nums[0] + nums[1] + nums[2];
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            int left = i + 1;
10            int right = nums.length - 1;
11
12            while (left < right) {
13                int currentSum = nums[i] + nums[left] + nums[right];
14
15                // Update closest sum
16                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
17                    closestSum = currentSum;
18                }
19
20                // Move pointers
21                if (currentSum < target) {
22                    left++;
23                } else if (currentSum > target) {
24                    right--;
25                } else {
26                    return currentSum; // exact match
27                }
28            }
29        }
30
31        return closestSum;
32    }
33}
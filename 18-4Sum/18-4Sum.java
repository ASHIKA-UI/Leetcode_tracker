// Last updated: 7/27/2026, 9:14:30 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        int n = nums.length;
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < n - 3; i++) {
11            // Skip duplicates for i
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13
14            for (int j = i + 1; j < n - 2; j++) {
15                // Skip duplicates for j
16                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
17
18                int left = j + 1;
19                int right = n - 1;
20
21                while (left < right) {
22                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
23
24                    if (sum == target) {
25                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
26
27                        left++;
28                        right--;
29
30                        // Skip duplicates
31                        while (left < right && nums[left] == nums[left - 1]) left++;
32                        while (left < right && nums[right] == nums[right + 1]) right--;
33
34                    } else if (sum < target) {
35                        left++;
36                    } else {
37                        right--;
38                    }
39                }
40            }
41        }
42        return result;
43    }
44}
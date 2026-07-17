// Last updated: 7/17/2026, 9:48:01 AM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count = 0;
4        for(int i = 0 ; i < nums.length; i++){
5            int num = nums[i];
6            int digits = 0;
7            while(num > 0){
8                num = num / 10;
9                digits++;
10            }
11            if(digits % 2 == 0){
12                count++;
13            }
14        }
15        return count;
16    }
17}
18
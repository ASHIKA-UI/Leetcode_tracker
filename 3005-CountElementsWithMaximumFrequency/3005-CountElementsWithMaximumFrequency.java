// Last updated: 7/24/2026, 10:06:49 AM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5       
6        for (int n : nums) {
7            map.put(n, map.getOrDefault(n, 0) + 1);
8        }
9
10        
11        int maxFreq = 0;
12        for (int freq : map.values()) {
13            maxFreq = Math.max(maxFreq, freq);
14        }
15
16        
17        int count = 0;
18        for (int freq : map.values()) {
19            if (freq == maxFreq) {
20                count += freq;
21            }
22        }
23
24        return count;
25    }
26}
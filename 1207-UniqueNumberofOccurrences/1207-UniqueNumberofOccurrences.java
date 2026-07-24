// Last updated: 7/24/2026, 10:06:17 AM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        Map<Integer, Integer> freq = new HashMap<>();
4
5        for (int num : arr) {
6            freq.put(num, freq.getOrDefault(num, 0) + 1);
7        }
8
9        Set<Integer> set = new HashSet<>(freq.values());
10
11        return set.size() == freq.size();
12    }
13}
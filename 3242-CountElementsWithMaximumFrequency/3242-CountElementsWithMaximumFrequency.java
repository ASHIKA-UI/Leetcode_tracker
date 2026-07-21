// Last updated: 7/21/2026, 8:58:06 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        
        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        
        int count = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }
}
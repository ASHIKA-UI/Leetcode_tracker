// Last updated: 7/21/2026, 9:01:34 AM
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int num : nums){
            set.add(num);
        }
        
        int max = 0;
    
        for(int num : set){
            
            
            if(!set.contains(num - 1)){
                
                int currentNum = num;
                int count = 1;
                
                
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }
                
                
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
}
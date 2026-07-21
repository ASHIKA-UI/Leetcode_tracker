// Last updated: 7/21/2026, 9:00:49 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int x: nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
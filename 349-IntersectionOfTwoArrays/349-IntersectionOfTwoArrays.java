// Last updated: 7/21/2026, 9:00:23 AM
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

    
        for (int x : nums1) {
            set1.add(x);
        }

      
        for (int x : nums2) {
            if (set1.contains(x)) {
                res.add(x);
            }
        }


        int[] ans = new int[res.size()];
        int i = 0;
        for (int x : res) {
            ans[i++] = x;
        }

        return ans;
    }
}
// Last updated: 7/21/2026, 9:01:01 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1){
                count++;
            }
            n = n >>> 1;      
        }

        return count;
    }
}

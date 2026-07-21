// Last updated: 7/21/2026, 8:59:48 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);   
        return (x & (x + 1)) == 0;
    }
}

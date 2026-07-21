// Last updated: 7/21/2026, 8:58:16 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 ==0){
            return n;
        }
        else{
            return n * 2;
        }
    }
}
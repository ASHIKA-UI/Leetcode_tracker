// Last updated: 7/21/2026, 9:00:27 AM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n <= 0){
            return false;
        }
        while ( n % 3 == 0){
            n = n/3;
        }
        return n == 1;

    }
   
}
// Last updated: 7/21/2026, 8:58:19 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0)
        {
            return true;
        }
        return num % 10 !=0;

    }
}
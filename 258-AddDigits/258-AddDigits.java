// Last updated: 7/21/2026, 9:00:39 AM
class Solution {
    public int addDigits(int num) {
        while(num >= 10) {          
            int sum = 0;
            while(num > 0) {   
                sum += num % 10;
                num /= 10;
            }
            num = sum;              
        }
        return num;
    }
}

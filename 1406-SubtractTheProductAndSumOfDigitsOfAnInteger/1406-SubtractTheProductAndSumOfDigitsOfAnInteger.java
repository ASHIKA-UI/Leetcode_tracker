// Last updated: 7/21/2026, 8:58:57 AM
class Solution {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;   

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            product *= digit;

            n = n / 10;
        }

        return product - sum;
    }
}

// Last updated: 7/21/2026, 8:58:08 AM
class Solution {
    public int accountBalanceAfterPurchase(int price) {
        int rounded = ((price + 5) / 10) * 10;
        return 100 - rounded;
    }
}

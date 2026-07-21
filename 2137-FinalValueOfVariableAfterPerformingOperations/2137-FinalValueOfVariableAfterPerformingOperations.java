// Last updated: 7/21/2026, 8:58:21 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String op : operations) {

            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}

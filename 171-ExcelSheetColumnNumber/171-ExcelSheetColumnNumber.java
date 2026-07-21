// Last updated: 7/21/2026, 9:01:16 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }
}
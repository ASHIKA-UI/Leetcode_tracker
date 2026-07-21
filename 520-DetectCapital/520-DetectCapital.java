// Last updated: 7/21/2026, 9:00:18 AM
class Solution {
    public boolean detectCapitalUse(String word) {

        String allUpper = word.toUpperCase();
        String allLower = word.toLowerCase();
        String firstUpper = word.substring(0,1).toUpperCase() +
                            word.substring(1).toLowerCase();

        if (word.equals(allUpper) ||
            word.equals(allLower) ||
            word.equals(firstUpper)) {
            return true;
        } else {
            return false;
        }
    }
}

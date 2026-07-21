// Last updated: 7/21/2026, 9:01:19 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 

            int rem = columnNumber % 26;
            char ch = (char) (rem + 'A');

            sb.append(ch);

            columnNumber = columnNumber / 26;
        }

        return sb.reverse().toString();
    }
}
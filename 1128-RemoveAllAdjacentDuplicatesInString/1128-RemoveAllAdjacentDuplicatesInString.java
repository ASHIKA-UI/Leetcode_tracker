// Last updated: 7/21/2026, 8:59:31 AM
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

           
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); 
            } else {
                sb.append(c); 
            }
        }

        return sb.toString();
    }
}

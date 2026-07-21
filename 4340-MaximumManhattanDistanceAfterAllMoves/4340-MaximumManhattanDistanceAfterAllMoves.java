// Last updated: 7/21/2026, 8:57:59 AM
class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l = 0, r = 0, wild = 0;
        
        for(int i = 0; i < moves.length(); i++){
            char move = moves.charAt(i);
            if(move == 'U') u++;
            else if(move == 'D') d++;
            else if(move == 'L') l++;
            else if(move == 'R') r++;
            else if(move == '_') wild++;
        }
        return Math.abs(r - l) + Math.abs(u - d) + wild;
    }
}
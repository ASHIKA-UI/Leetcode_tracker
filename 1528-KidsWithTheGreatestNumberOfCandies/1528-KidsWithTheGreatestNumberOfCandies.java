// Last updated: 7/21/2026, 8:58:43 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        
        for (int i = 0; i < candies.length; i++) {

            int total = candies[i] + extraCandies;

           
            result.add(total >= max);
        }

        return result;
    }
}

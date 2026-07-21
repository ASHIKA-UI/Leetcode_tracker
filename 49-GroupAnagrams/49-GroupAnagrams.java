// Last updated: 7/21/2026, 9:02:12 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            if(!map.containsKey(s)){
                 map.put(s, new ArrayList<>());
            } 
            map.get(s).add(word);
        } 
        return new ArrayList<>(map.values());
    }
}
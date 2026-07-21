// Last updated: 7/21/2026, 9:00:24 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        int[] a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = list.get(i);
        }
        return a;


    }
}
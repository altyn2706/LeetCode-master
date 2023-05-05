class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num), map.get(num) + 1);
            } else map.put(num, 0);
        }
        
        Map.Entry<Integer, Integer> majorityEntry = null;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()){
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
        
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), 1+sMap.get(s.charAt(i)));
            }
            else {
                sMap.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), 1+tMap.get(t.charAt(i)));
            }
            else {
                tMap.put(t.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(tMap.containsKey(s.charAt(i))){
                if(Objects.equals(sMap.get(s.charAt(i)), tMap.get(s.charAt(i)))){
                    sMap.remove(s.charAt(i));
                }
            }
        }
        return sMap.size()==0;
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Character> allLetters = new HashMap<>();
            for(int i =0 ; i < sentence. length(); i++){
                allLetters.put(sentence.charAt(i),sentence.charAt(i));
                if(allLetters.size()==26) return true;
            }
            return false;
    }
}
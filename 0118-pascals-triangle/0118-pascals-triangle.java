class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listList = new ArrayList<>();
        int number  = 1;
        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            number = 1;
            for(int k = 0; k <=i; k++){
                list.add(number);
                number = number * (i - k)/ (k+1);
            }
            listList.add(list);
        }
        return listList;
    }
}
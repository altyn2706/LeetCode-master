class Solution {
    public int[] getConcatenation(int[] nums) {
                int[] nums2 = new int[nums.length*2];
        int counter = 0;
        for(int i = 0; i < nums2.length; i++){
            nums2[i] = nums[counter];
            if(counter==nums.length-1) counter = 0;
            else counter++;
        }
        return nums2;
    }
}
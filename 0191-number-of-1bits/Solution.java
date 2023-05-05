package numberOf1Bits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            n = n & (n-1);
            res++;
        }
        return res;
    }

}

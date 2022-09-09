package ReverseBits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        rev <<= 1;

        // if current bit is '1'
        if ((int)(n & 1) == 1)
            rev ^= 1;

        // bitwise right shift
        //'n' by 1
        n >>= 1;
        return rev;
    }
    public static void main(String[] args) {
        int input = 7;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.reverseBits(input));
    }

}




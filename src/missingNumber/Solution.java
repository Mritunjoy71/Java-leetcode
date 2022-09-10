package missingNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }


    public static void main(String[] args) {
        int[] input = {1, 0};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.missingNumber(input));
    }

}




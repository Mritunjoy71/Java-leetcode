package evenDigits;

import java.util.Stack;

public class Solution {
    public int findNumbers(int[] nums) {
        /*int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                digits++;
            }
            if (digits != 0 && digits % 2 == 0)
                count++;
        }
        return count;*/

        //log base 10 of a number gives the number of digits - 1
        int res=0;
        for(int num:nums) {
            res+=(int)(Math.log10(num)) & 1;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] input = {12, 345, 2, 6, 7896};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.findNumbers(input));
    }

}




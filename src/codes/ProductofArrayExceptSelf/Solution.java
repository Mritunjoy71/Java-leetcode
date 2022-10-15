package codes.ProductofArrayExceptSelf;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            answer[i] *= postfix;
            postfix *= nums[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] input = {-1,1,0,-3,3};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.productExceptSelf(input)));
    }

}




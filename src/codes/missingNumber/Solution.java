package codes.missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        /*int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;*/
        int res = nums.length;
        for (int i =0; i < nums.length;i++){
            res += (i - nums[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] input = {1, 0};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.missingNumber(input));
    }

}




package ArrayPartitionI;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        int maxSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2)
            maxSum += nums[i];
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input = {6, 2, 6, 5, 1, 2};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.arrayPairSum(input));
    }

}




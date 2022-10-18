package codes.LongestIncreasingSubsequence;

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLen =1;
        for (int i = nums.length - 1; i >= 0; i--)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                    maxLen = Math.max(maxLen,dp[i]);
                }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 2, 3};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.lengthOfLIS(nums));
    }
}



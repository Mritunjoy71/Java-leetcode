package codes.CountingBits;

import java.util.Arrays;

class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);
        int offset = 1;
        for (int i = 1; i < n + 1; i++) {
            if (offset * 2 == i)
                offset = i;
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }

    public static void main(String[] args) {
        int k = 3;
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.countBits(k)));
    }

}




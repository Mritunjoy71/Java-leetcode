package codes.CoinChange;

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        if (dp[amount] != amount + 1)
            return dp[amount];
        else return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 5};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.coinChange(input, 11));
    }
}




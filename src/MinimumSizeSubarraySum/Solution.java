package MinimumSizeSubarraySum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, ans = Integer.MAX_VALUE, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum >= target)
                    ans = Math.min(ans, j - i + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }*/

    /*public int minSubArrayLen(int target, int[] nums) {
        int sum, ans = Integer.MAX_VALUE, n = nums.length;
        List<Integer> sumMap = new ArrayList<>();
        sumMap.add(nums[0]);
        for (int i = 1; i < n; i++) {
            sum = sumMap.get(i - 1) + nums[i];
            sumMap.add(sum);
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sumMap.get(j) - sumMap.get(i) + nums[i];
                if (sum >= target)
                    ans = Math.min(ans, j - i + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }*/

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, ans = Integer.MAX_VALUE, n = nums.length, left = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 1, 1, 1, 1};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.minSubArrayLen(11, input));
    }

}




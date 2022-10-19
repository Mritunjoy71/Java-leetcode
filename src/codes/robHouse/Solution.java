package codes.robHouse;

class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 2, 3};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.rob(nums));
    }
}



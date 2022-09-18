package LargestNumberAtLeastTwiceofOthers;

class Solution {
    public int dominantIndex(int[] nums) {
        int ret = -1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max) {
                max = nums[i];
                ret = i;
            }
        for (int i = 0; i < nums.length; i++) {
            if (i != ret && max < 2 * nums[i])
                return -1;

        }
        return ret;
    }


    public static void main(String[] args) {
        int[] input = {3,6,1,0};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.dominantIndex(input));
    }

}




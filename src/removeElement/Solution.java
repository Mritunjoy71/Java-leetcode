package removeElement;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, nonMatchIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                count++;
                nums[i] = nums[nonMatchIndex--];
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }


    public static void main(String[] args) {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.removeElement(input, 2));
    }

}




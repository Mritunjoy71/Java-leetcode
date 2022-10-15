package codes.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[insertPosition++] = nums[i];
            }
        }
        return insertPosition;
    }

    public void moveZeroes(int[] nums) {
        int insertPosition = 0, zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else
                nums[insertPosition++] = nums[i];
        }

        while (zeroCount > 0) {
            nums[nums.length - zeroCount] = 0;
            zeroCount--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        solution.moveZeroes(input);
        //System.out.println("Result: " + solution.moveZeroes(input));
    }

}




package SquaresofaSortedArray;

import java.util.Arrays;

class Solution {
    /*public int[] sortedSquares(int[] nums) {
        int max = Math.abs(nums[0]);
        for (int item : nums)
            max = Math.max(max, Math.abs(item));
        int[] bucket = new int[max + 1];
        Arrays.fill(bucket, 0);
        for (int item : nums)
            bucket[Math.abs(item)]++;
        int j = 0;
        for (int i = 0; i < max + 1; i++) {
            while (bucket[i] > 0) {
                nums[j++] = i * i;
                bucket[i]--;
            }
        }
        return nums;
    }*/


    public int[] sortedSquares(int[] nums) {
        int max = Math.abs(nums[0]);
        for (int item : nums)
            max = Math.max(max, Math.abs(item));
        int[] bucket = new int[max + 1];
        Arrays.fill(bucket, 0);
        for (int item : nums)
            bucket[Math.abs(item)]++;
        int j = 0;
        for (int i = 0; i < max + 1; i++) {
            while (bucket[i] > 0) {
                nums[j++] = i * i;
                bucket[i]--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.sortedSquares(input)));
    }

}




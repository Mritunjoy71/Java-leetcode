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

    public int heightChecker(int[] heights) {
        /*int[] copyArray = heights.clone();
        Arrays.sort(copyArray);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copyArray[i])
                count++;
        }
        return count;*/

        int[] heightFreq = new int[101];
        for (int h : heights) {
            heightFreq[h]++;
        }
        int currentHeight = 0;
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            while (heightFreq[currentHeight] == 0)
                currentHeight++;

            if (currentHeight != heights[i])
                result++;

            heightFreq[currentHeight]--;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] input = {5, 1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.heightChecker(input));
    }

}




package TwoSumII_Inputarrayissorted;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int slowPointer = 0, fastPointer = numbers.length - 1;
        while (slowPointer < fastPointer) {
            if (numbers[slowPointer] + numbers[fastPointer] == target)
                return new int[]{slowPointer + 1, fastPointer + 1};
            else if (numbers[slowPointer] + numbers[fastPointer] > target)
                fastPointer--;
            else slowPointer++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {-1,0};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.twoSum(input, -1)));
    }

}




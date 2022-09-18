package FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            int index = Math.abs(n) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;*/

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            while (nums[k - 1] != k) {
                int temp = nums[k - 1];
                nums[k - 1] = k;
                k = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                result.add(i + 1);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.findDisappearedNumbers(input));
    }

}




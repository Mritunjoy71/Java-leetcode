package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int target = nums[i] + nums[left] + nums[right];
                if (target < 0)
                    left += 1;
                else if (target > 0)
                    right -= 1;
                else {
                    answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left += 1;
                    while (nums[left] == nums[left - 1] && left < right)
                        left += 1;
                }

            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        Solution solution = new Solution();
        System.out.println("Result: " + solution.threeSum(nums));
    }

}




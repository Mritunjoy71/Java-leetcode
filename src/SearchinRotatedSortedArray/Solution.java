package SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle])
                return middle;

            //left sorted portion
            if (nums[left] <= nums[middle]) {
                if (target < nums[left] || target > nums[middle])
                    left = middle + 1;
                else right = middle - 1;
            } else {
                if (target > nums[right] || target < nums[middle])
                    right = middle - 1;
                else left = middle + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] input = {-1, 1, 0, -3, 3};
        int target = 0;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.search(input, target));
    }

}




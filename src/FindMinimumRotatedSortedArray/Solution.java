package FindMinimumRotatedSortedArray;

class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] < nums[right]) {
                min = Math.min(nums[left], min);
                break;
            }

            int middle = (left + right) / 2;
            min = Math.min(min, nums[middle]);
            if (nums[middle] >= nums[left])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return min;

    }

    public static void main(String[] args) {
        int[] input = {3, 4, 5, 1, 2};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.findMin(input));
    }

}




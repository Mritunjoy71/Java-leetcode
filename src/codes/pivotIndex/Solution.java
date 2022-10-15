package codes.pivotIndex;

class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1, sum = 0, currentSum = 0;
        for (int n : nums)
            sum += n;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum == sum - nums[i] - currentSum)
                return i;
            else
                currentSum += nums[i];
        }
        return pivot;
    }


    public static void main(String[] args) {
        int[] input = {2, -1, -1};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.pivotIndex(input));
    }

}




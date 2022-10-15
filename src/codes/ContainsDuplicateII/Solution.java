package codes.ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                set.remove(nums[i-k-1]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1};
        int k = 2;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.containsNearbyDuplicate(input, k));
    }

}




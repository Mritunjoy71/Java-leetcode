package codes.FourSumII;

import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                hashMap.put(nums1[i] + nums2[j], hashMap.getOrDefault(nums1[i] + nums2[j], 0) + 1);
            }
        }

        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                result += hashMap.getOrDefault(-nums3[i] - nums4[j], 0);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2}, nums2 = {-2, -1}, nums3 = {-1, 2}, nums4 = {0, 2};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.fourSumCount(nums1, nums2, nums3, nums4));
    }

}




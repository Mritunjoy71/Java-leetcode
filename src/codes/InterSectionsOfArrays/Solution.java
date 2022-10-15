package codes.InterSectionsOfArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int a : nums1) {
            map.put(a, true);
        }
        for (int a : nums2) {
            if (map.get(a) != null && map.get(a) == true){
                list.add(a);
                map.put(a,false);
            }
        }
        int[] ans = new int[list.size()];
        int i =0;
        for (int a: list)
            ans[i++] =a;
        return ans;


    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.intersection(nums1, nums2)));
    }

}




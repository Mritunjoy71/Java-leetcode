package codes.TopKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums)
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        List<List<Integer>> frequencyList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            frequencyList.add(new ArrayList<>());
        for (Integer key : countMap.keySet()) {
            frequencyList.get(countMap.get(key) - 1).add(key);
        }

        int j = 0;
        for (int i = frequencyList.size() - 1; i >= 0; i--) {
            if (frequencyList.get(i).size() > 0)
                for (int n : frequencyList.get(i)) {
                    res[j++] = n;
                    if (j >= k)
                        return res;
                }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.topKFrequent(nums, k)));
    }

}




package codes.MinimumIndexSumofTwoLists;

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            hashMap.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (hashMap.get(list2[i]) != null) {
                if (hashMap.get(list2[i]) + i < minSum) {
                    minSum = Math.min(minSum, hashMap.get(list2[i]) + i);
                    list.clear();
                    list.add(list2[i]);
                }else if (hashMap.get(list2[i]) + i == minSum){
                    list.add(list2[i]);
                }
            }
        }

        return list.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good"}, list2 = {"sad", "happy", "good"};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.findRestaurant(list1, list2)));
    }

}




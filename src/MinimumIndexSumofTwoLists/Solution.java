package MinimumIndexSumofTwoLists;

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> commonMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            hashMap.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (hashMap.get(list2[i]) != null) {
                if (hashMap.get(list2[i]) + i <= minSum) {
                    minSum = Math.min(minSum, hashMap.get(list2[i]) + i);
                    commonMap.put(list2[i], hashMap.get(list2[i]) + i);
                }
            }
        }

        List<String> answerList = new ArrayList<>();
        for (String key:commonMap.keySet())
            if (commonMap.get(key)==minSum){
                answerList.add(key);
            }
        return answerList.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good"}, list2 = {"sad", "happy", "good"};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.findRestaurant(list1, list2)));
    }

}




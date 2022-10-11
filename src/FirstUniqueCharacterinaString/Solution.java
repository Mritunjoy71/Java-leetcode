package FirstUniqueCharacterinaString;

import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        int i = 0;
        for (Character character : s.toCharArray()) {
            if (hashMap.get(character) == null)
                hashMap.put(character, i);
            else {
                hashMap.put(character, -1);
            }
            i++;
        }
        for (Character character:hashMap.keySet()){
            if (hashMap.get(character)>-1)
                return hashMap.get(character);
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "leetcode";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.firstUniqChar(input));
    }

}




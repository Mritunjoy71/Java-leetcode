package LongestSubstringWithoutRepeatingCharacters;

import java.util.LinkedHashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int maxLen = 0;
        char[] characters = s.toCharArray();
        int i = 0;
        while (i < characters.length) {
            while (!set.add(characters[i])) {
                set.remove(set.iterator().next());
            }
            i++;
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }



    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.lengthOfLongestSubstring(s));
    }
}



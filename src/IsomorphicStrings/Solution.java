package IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> letterMap = new HashMap<>();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (letterMap.get(s.charAt(i)) == null && !hashSet.contains(t.charAt(i))) {
                letterMap.put(s.charAt(i), t.charAt(i));
                hashSet.add(t.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (letterMap.get(s.charAt(i)) == null || letterMap.get(s.charAt(i)) != t.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "bbbaaaba", t = "aaabbbba";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.isIsomorphic(s, t));
    }

}




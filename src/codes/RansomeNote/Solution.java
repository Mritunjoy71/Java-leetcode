package codes.RansomeNote;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            int currentCount = hashMap.getOrDefault(ch, 0);
            hashMap.put(ch, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int currentCount = hashMap.getOrDefault(ch, 0);
            if (currentCount == 0)
                return false;
            hashMap.put(ch, currentCount - 1);
        }

        return true;

    }

    public static void main(String[] args) {
        String ransomNote = "aaa", magazine = "aab";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.canConstruct(ransomNote, magazine));
    }

}




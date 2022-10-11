package JewelsandStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (Character character : jewels.toCharArray())
            set.add(character);
        int result = 0;
        for (Character character : stones.toCharArray())
            if (set.contains(character))
                result++;
        return result;

    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.numJewelsInStones(jewels, stones));
    }
}



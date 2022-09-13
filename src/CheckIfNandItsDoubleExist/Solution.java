package CheckIfNandItsDoubleExist;

import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> mapSeen = new HashSet<>();

        for (int item : arr) {
            if (mapSeen.contains(2 * item)  || (item%2 ==0 && mapSeen.contains(item/2) ))
                return true;
            else mapSeen.add(item);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] input = {7,1,14,11};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.checkIfExist(input));
    }

}




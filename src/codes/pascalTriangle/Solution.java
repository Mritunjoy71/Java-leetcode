package codes.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            List<Integer> tempList = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    tempList.add(j, 1);

                } else {
                    tempList.add(j, result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(tempList);
        }

        return result;
    }


    public static void main(String[] args) {
        int input = 0;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.generate(input));
    }

}




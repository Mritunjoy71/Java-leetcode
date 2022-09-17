package ReplaceElementswithGreatestElementonRightSide;

import java.util.Arrays;

class Solution {
    public int[] replaceElements(int[] arr) {
        /*for (int i = 0; i < arr.length; i++) {
            int replace = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > replace)
                    replace = arr[j];
            }
            arr[i] = replace;
        }*/

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int a = arr[i];
            arr[i] = max;
            max = Math.max(a, max);
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] input = {17, 18, 5, 4, 6, 1};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.replaceElements(input)));
    }

}




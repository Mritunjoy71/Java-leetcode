package DuplicateZeros;

import java.util.Arrays;

class Solution {
   /* public void duplicateZeros(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            if (arrCopy[j] == 0) {
                arr[i++] = 0;
                if (i < arr.length)
                    arr[i++] = 0;
            } else
                arr[i++] = arrCopy[j];
            j++;
        }

    }*/


    public void duplicateZeros(int[] arr) {
        int left, duplicates = 0, length_ = arr.length - 1;

        for (left = 0; left <= length_ - duplicates; left++) {

            if (arr[left] == 0) {
                if (left == length_ - duplicates) {
                    arr[length_] = 0;
                    length_--;
                    break;
                }
                duplicates++;
            }
        }

        int last = length_ - duplicates;
        for (; last >= 0; last--) {
            if (arr[last] == 0) {
                arr[last + duplicates] = 0;
                duplicates--;
                arr[last + duplicates] = 0;
            } else
                arr[last + duplicates] = arr[last];
        }

    }


    public static void main(String[] args) {
        int[] input = {1, 5, 2, 0, 6, 8, 0, 6, 0};
        Solution solution = new Solution();
        solution.duplicateZeros(input);
        System.out.println("Result: " + Arrays.toString(input));
    }

}




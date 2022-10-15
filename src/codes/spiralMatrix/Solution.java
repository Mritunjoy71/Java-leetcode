package codes.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int leftDirection = 0, rightDirection = 1, upDirection = 0, downDirection = 0;
        int totalElements = matrix.length * matrix[0].length;
        int rowStart = 0, rowEnd = matrix.length - 1, columnStart = 0, columnEnd = matrix[0].length - 1;

        do {
            if (rightDirection == 1 && columnStart <= columnEnd) {
                for (int i = columnStart; i <= columnEnd; i++)
                    result.add(matrix[rowStart][i]);
                rowStart++;
                rightDirection = 0;
                downDirection = 1;
            }

            if (downDirection == 1 && rowStart <= rowEnd) {
                for (int i = rowStart; i <= rowEnd; i++)
                    result.add(matrix[i][columnEnd]);
                columnEnd--;
                downDirection = 0;
                leftDirection = 1;
            }

            if (leftDirection == 1 && columnStart <= columnEnd) {
                for (int i = columnEnd; i >= columnStart; i--)
                    result.add(matrix[rowEnd][i]);
                rowEnd--;
                leftDirection = 0;
                upDirection = 1;
            }

            if (upDirection == 1 && rowStart <= rowEnd) {
                for (int i = rowEnd; i >= rowStart; i--)
                    result.add(matrix[i][columnStart]);
                columnStart++;
                upDirection = 0;
                rightDirection = 1;
            }
            System.out.println("looping");

        } while (result.size() != totalElements);

        System.out.println("list:"+result);
        return result;
    }


    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Solution solution = new Solution();
        System.out.println("hello");
        System.out.println("Result: " + solution.spiralOrder(input));
        //Output: [1,2,3,4,8,12,11,10,9,5,6,7]

    }

}




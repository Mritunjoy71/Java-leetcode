package codes.DiagonalTraverse;

import java.util.*;

class Solution {
    /*public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < (m + n - 1); i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.get(i + j).add(mat[i][j]);
            }
        }

        int[] result = new int[m * n];
        int k = 0;
        result[k++] = list.get(0).get(0);

        for (int i = 1; i < list.size(); i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < list.get(i).size(); j++)
                    result[k++] = list.get(i).get(j);
            } else {
                for (int j = list.get(i).size() - 1; j >= 0; j--)
                    result[k++] = list.get(i).get(j);
            }
        }

        return result;

    }*/


   /* public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int k = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m + n - 1; i++) {
            int row = i < n ? 0 : i - n + 1;
            int col = i < n ? i : n - 1;

            list.clear();
            while (row < m && col > -1) {
                list.add(mat[row][col]);
                row++;
                col--;
            }

            if (i % 2 == 0) {
                Collections.reverse(list);
            }
            for (Integer integer : list) result[k++] = integer;
        }

        return result;

    }*/


    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int k = 0;
        int direction = 1;
        int row = 0, column = 0;
        while (row < m && column < n) {
            result[k++] = mat[row][column];
            int newRow = row + (direction == 1 ? -1 : 1);
            int newColumn = column + (direction == 1 ? 1 : -1);
            if (newRow < 0 || newRow == m || newColumn < 0 || newColumn == n) {
                if (direction == 1) {
                    row += (column == n - 1 ? 1 : 0);
                    column += (column < n - 1 ? 1 : 0);
                } else {
                    row += (row < m - 1 ? 1 : 0);
                    column += (row == m - 1 ? 1 : 0);
                }
                direction = 1 - direction;
            } else {
                row = newRow;
                column = newColumn;
            }
        }

        return result;

    }

    public int[] findDiagonalOrder2(int[][] matrix) {

        // Check for empty matrices
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int N = matrix.length;
        int M = matrix[0].length;
        int row = 0, column = 0;

        int direction = 1;

        // The final result array
        int[] result = new int[N * M];
        int r = 0;
        while (row < N && column < M) {

            result[r++] = matrix[row][column];
            int new_row = row + (direction == 1 ? -1 : 1);
            int new_column = column + (direction == 1 ? 1 : -1);

            if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {
                if (direction == 1) {
                    row += (column == M - 1 ? 1 : 0);
                    column += (column < M - 1 ? 1 : 0);

                } else {
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }
                direction = 1 - direction;

            } else {

                row = new_row;
                column = new_column;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        System.out.println("Result: " + Arrays.toString(solution.findDiagonalOrder(input)));
    }

}




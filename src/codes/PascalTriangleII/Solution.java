package codes.PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*public BigInteger multiplyNumbers(int num) {
        if (num >= 1)
            return new BigInteger(String.valueOf(num)).multiply(multiplyNumbers(num - 1));
        else
            return new BigInteger("1");
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(0, 1);
        for (int i = 1; i < rowIndex; i++) {
            result.add(i, 0);
        }
        if (rowIndex == 0)
            return result;
        for (int i = 1; i <= rowIndex / 2; i++) {
            BigInteger a = multiplyNumbers(rowIndex);
            BigInteger b = multiplyNumbers(i);
            BigInteger c = multiplyNumbers(rowIndex - i);
            BigInteger num = a.divide(b.multiply(c));
            result.set(i, num.intValue());
            result.set(rowIndex - i, num.intValue());
        }
        result.add(1);
        System.out.println("size:" + result.size());
        return result;
    }*/

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Result: " + solution.getRow(33));
    }

}




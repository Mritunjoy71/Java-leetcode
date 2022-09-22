package AddBinary;

class Solution {
    /*public String addBinary(String a, String b) {
        String result ="";
        int resInt = Integer.parseInt(a,2)+ Integer.parseInt(b,2);
        result = Integer.toBinaryString(resInt);
        return result;
    }*/

    /*public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLen = a.length() - 1, bLen = b.length() - 1;
        int carryOut = 0;
        while (aLen >= 0 || bLen >= 0) {
            char aChar = ' ';
            if (aLen >= 0) {
                aChar = a.charAt(aLen);
                aLen--;
            }
            char bChar = ' ';
            if (bLen >= 0) {
                bChar = b.charAt(bLen);
                bLen--;
            }
            int aInt = 0, bInt = 0;
            if (aChar == '1')
                aInt = 1;
            if (bChar == '1')
                bInt = 1;

            int resInt = carryOut + aInt + bInt;
            if (resInt == 2) {
                carryOut = 1;
                resInt = 0;
            } else if (resInt == 3) {
                carryOut = 1;
                resInt = 1;
            } else {
                carryOut = 0;
            }
            if (resInt == 0)
                result = new StringBuilder("0" + result);
            else
                result = new StringBuilder("1" + result);
        }
        if (carryOut==1)
            result = new StringBuilder("1" + result);
        return result.toString();
    }*/

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String a = "1010", b = "1011";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.addBinary(a, b));
    }

}




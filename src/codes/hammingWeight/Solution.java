package codes.hammingWeight;

class Solution {
    /*public int codes.hammingWeight(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int count = 0;
        for (char ch:binaryStr.toCharArray()) {
            if (ch == '1')
                count++;
        }
        return count;
    }*/

    /*public int codes.hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count = count + (n & 1);
            n = n >>> 1;
        }
        return count;
    }*/

//    public int codes.hammingWeight(int n) {
//        //negative int kaj korena
//        int[] positionValue256 = new int[256];
//        positionValue256[0] = 0;
//        for (int i = 0; i < 256; i++) {
//            positionValue256[i] = (i & 1) + positionValue256[i / 2];
//        }
//
//        return (positionValue256[n & 0xff]
//                + positionValue256[(n >> 8) & 0xff]
//                + positionValue256[(n >> 16) & 0xff]
//                + positionValue256[n >> 24]);
//    }

    static int[] num_to_bits = new int[] { 0, 1, 1, 2, 1, 2, 2,
            3, 1, 2, 2, 3, 2, 3, 3, 4 };

    /* Recursively get nibble of a given number
and map them in the array */
    static int hammingWeight(int num)
    {
        int nibble = 0;
        if (0 == num)
            return num_to_bits[0];

        // Find last nibble
        nibble = num & 0xf;

        // Use pre-stored values to find count
        // in last nibble plus recursively add
        // remaining nibbles.
        return num_to_bits[nibble] + hammingWeight(num >> 4);
    }

    public static void main(String[] args) {
        int input = 3;
        Solution solution = new Solution();
        System.out.println("Result: " + Solution.hammingWeight(input));
    }
}




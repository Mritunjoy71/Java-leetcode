package codes.romanToInteger;

class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        if (len == 0)
            return 0;
        int val = 0;

        int[] mappingArray = new int[26];
        mappingArray['I' - 'A'] = 1;
        mappingArray['V' - 'A'] = 5;
        mappingArray['X' - 'A'] = 10;
        mappingArray['L' - 'A'] = 50;
        mappingArray['C' - 'A'] = 100;
        mappingArray['D' - 'A'] = 500;
        mappingArray['M' - 'A'] = 1000;
        char prev = 'A';

        for (char ch : s.toCharArray()) {
            if (mappingArray[ch - 'A'] > mappingArray[prev - 'A']) {
                val = val - 2 * mappingArray[prev - 'A'];
            }
            val = val + mappingArray[ch - 'A'];
            prev = ch;
        }

        return val;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.romanToInt(s));
    }
}




package hammingDistance;

class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int n = x ^ y;
        while (n != 0) {
            distance++;
            n &= n-1;
        }
        return distance;
    }

    public static void main(String[] args) {
        int input = 3, input2 = 4;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.hammingDistance(input,input2));
    }
}




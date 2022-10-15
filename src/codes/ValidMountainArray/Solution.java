package codes.ValidMountainArray;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        boolean increasing = true;
        int i, pickIndex = 0;
        for (i = 1; i < arr.length; i++) {
            if (increasing && arr[i] < arr[i - 1]) {
                increasing = false;
                pickIndex = i - 1;
            }else if (increasing && arr[i] == arr[i - 1])
                return false;
            else if (!increasing && arr[i] >= arr[i - 1])
                return false;
        }
        System.out.println("ans:"+pickIndex);
        return !increasing && pickIndex > 0 && pickIndex < arr.length - 1;
    }


    public static void main(String[] args) {
        int[] input = {3, 5, 2};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.validMountainArray(input));
    }

}




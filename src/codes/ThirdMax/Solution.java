package codes.ThirdMax;

class Solution {
    public int thirdMax(int[] nums) {

        /*Integer[] maxArray = new Integer[3];
        maxArray[0] = nums[0];//first max
        maxArray[1] = Integer.MIN_VALUE;//second max
        maxArray[2] = Integer.MIN_VALUE;//third max
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(nums[0], true);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                continue;
            if (nums[i] > maxArray[0]) {
                maxArray[2] = maxArray[1];
                maxArray[1] = maxArray[0];
                maxArray[0] = nums[i];
            } else if (nums[i] > maxArray[1]) {
                maxArray[2] = maxArray[1];
                maxArray[1] = nums[i];
            } else if (nums[i] > maxArray[2]) {
                maxArray[2] = nums[i];
            }

            map.put(nums[i], true);
        }

        if (map.size() < 3)
            return maxArray[0];
        return maxArray[2];*/


        Integer[] maxArray = new Integer[3];

        for (Integer n : nums) {
            if (n.equals(maxArray[0]) || n.equals(maxArray[1]) || n.equals(maxArray[2]))
                continue;
            if (maxArray[0] == null || n > maxArray[0]) {
                maxArray[2] = maxArray[1];
                maxArray[1] = maxArray[0];
                maxArray[0] = n;
            } else if (maxArray[1] == null || n > maxArray[1]) {
                maxArray[2] = maxArray[1];
                maxArray[1] = n;
            } else if (maxArray[2] == null || n > maxArray[2]) {
                maxArray[2] = n;
            }

        }

        if (maxArray[2] == null)
            return maxArray[0];
        return maxArray[2];
    }


    public static void main(String[] args) {
        int[] input = {3, 2, 1};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.thirdMax(input));
    }

}




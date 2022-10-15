package codes.ContainerwithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right])
                left += 1;
            else right -= 1;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int k = 2;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.maxArea(input));
    }

}




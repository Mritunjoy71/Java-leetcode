import java.util.Arrays;

import static java.lang.Math.abs;

class test {
    public int threeSumClosest(int[] nums, int target) {
        int sum;
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        int i = 0;
        Arrays.sort(nums);
        while (i < nums.length) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                sum = nums[low] + nums[high] + nums[i];
                if (abs(sum - target) < diff) {
                    diff = abs(sum - target);
                    ans = sum;
                }
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
            i++;
        }
        return ans;
    }
}

public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(new test().threeSumClosest(nums,1));

    }
}

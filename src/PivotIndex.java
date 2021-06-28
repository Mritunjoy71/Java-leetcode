public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0, rightSum = 0;
        for (int i = 0 ;i < n ;i++) {
            if (i >0)
                leftSum += nums[i-1];
            rightSum = 0;
            for (int j = i+1; j < n;j++)
                rightSum += nums[j];

            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbs = {1,7,3,6,5,6} ;
        PivotIndex p = new PivotIndex();
        System.out.println(p.pivotIndex(numbs));
    }
}

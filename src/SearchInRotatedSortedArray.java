public class SearchInRotatedSortedArray {
    public boolean isBinarySearchHelpful(int[] nums, int start, int element) {
        return nums[start] != element;
    }
    public boolean isExistsInFirst(int[] nums, int start, int element) {
        return nums[start] <= element;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return false;
        int end = n - 1;
        int start = 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target)
                return true;
            if (!isBinarySearchHelpful(nums,start,nums[mid])) {
                start++;
                continue;
            }
            boolean pivotArray = isExistsInFirst(nums,start,nums[mid]);
            boolean targetArray = isExistsInFirst(nums,start, target);
            if(pivotArray ^ targetArray){
                if (pivotArray){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
            else {
                if (nums[mid] < target)
                    start = mid +1;
                else end = mid-1;
            }

        }

        return false;
    }


    public static void main(String[] args) {
        int[] numbs = {2,5,6,0,0,1,2} ;
        int  target = 0 ;
        //[4,5,6,7,0,1,2]
        //3
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        System.out.println(s.search(numbs,target));
    }
}

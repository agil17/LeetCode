package Java;

public class BinarySearch {
    public static void main(String[] args) {
        //replicate first bad version
        int [] nums = {0, 1, 2, 6, 7, 9, 22, 35};

        System.out.printf("Target %d found at index: %d", 9, binarySearch(nums, 9));
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
            int mid = low + ((high - low)/2);
            
            if(nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return high;
    }
}

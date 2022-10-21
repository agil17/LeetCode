

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {7, 3, 6, 2, 5, 1};
        insertionSort(nums);
        print(nums);
    }

    public static void insertionSort(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i -1;

            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    public static void print(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}

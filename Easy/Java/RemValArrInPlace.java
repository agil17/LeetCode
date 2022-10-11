package Java;

public class RemValArrInPlace {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        remove(arr, 3);
    }

    public static void remove(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}

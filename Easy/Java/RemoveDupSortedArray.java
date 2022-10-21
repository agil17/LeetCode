

public class RemoveDupSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4};
        int len = sort(arr);
    }

    public static int sort(int [] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1 && nums[i] == nums[i+1]) {

            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }

        for(int i = 0; i < count; i++) {
            System.out.printf("%d ", nums[i]);
        }
        return count;
    }
}

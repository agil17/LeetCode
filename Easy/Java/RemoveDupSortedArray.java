package Java;

public class RemoveDupSortedArray {
    public static void main(String[] args) {

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
}

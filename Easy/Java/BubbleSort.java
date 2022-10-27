public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,9,5};

        BubbleSort ob = new BubbleSort();

        int[] sort = ob.bubbleSort(arr);
    }

    public int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                print(arr);
            }
        }
        return arr;
    }

    public void print(int[] arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}

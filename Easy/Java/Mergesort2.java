public class Mergesort2 {
  public static void main(String[] args) {
    int[] arr = {4, 6, 3, 7, 2, 5};
    arr = sort(arr);
    print(arr);
    
    
  }

  public static void print(int[] arr) {
    for(int i: arr) {
      System.out.printf("%d ", i);
    }
    System.out.println();
  }

  public static int[] sort(int[] arr) {
    if(arr.length <= 1) {
      return arr;
    }
    else {
      int mid = arr.length/2;

      int[] left = new int[mid];
      int[] right = new int[arr.length - mid];

      for(int i = 0; i < left.length; i++) {
        left[i] = arr[i];
      }

      for(int i = 0; i < right.length; i++) {
        right[i] = arr[mid + i];
      }

      left = sort(left);
      right = sort(right);

      int[] sorted = merge(left, right);

      return sorted;
    }
  }

  public static int[] merge(int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int current = 0;

    int[] sorted = new int[left.length + right.length];

    while(i < left.length && j < right.length) {
      if(left[i] >= right[j]) {
        sorted[current] = left[i];
        i++;
      }
      else {
        sorted[current] = right[j];
        j++;
      }
      current++;
    }

    while(i < left.length) {
      sorted[current] = left[i];
      i++;
      current++;
    }

    while(j < right.length) {
      sorted[current] = right[j];
      j++;
      current++;
    }

    return sorted;
  }

}
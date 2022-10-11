package Java;

import org.w3c.dom.ls.LSException;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int [] l1 = {1, 3, 5};
        int [] l2 = {5, 7, 8};

        int [] merged = merge(l1, l2);
        for (int i = 0; i < merged.length; i++) {
            System.out.printf("%d ", merged[i]); 
        }
    }

    public static int[] merge(int[] l1, int[] l2) {
        int i = 0;
        int j = 0;
        int current = 0;
        int[] merged = new int[l1.length + l2.length];
        
        while(i < l1.length && j < l2.length) {
            if(l1[i] <= l2[j]) {
                merged[current] = l1[i];
                current++;
                i++;
            }
            else {
                merged[current] = l2[j];
                current++;
                j++;
            }
        }

        while(i < l1.length) {
            merged[current] = l1[i];
            current++;
            i++;
        }
        while(j < l2.length) {
            merged[current] = l2[j];
            current++;
            j++;
        }

        return merged;
    }

    // public static void print(int i, int j, int current,
    //                          int l1Value, int l2Value, 
    //                          int mergedValue) {
    //     System.out.printf("i=%d; j=%d; current=%d;\n l1Value=%d; l2Value=%d; mergedValue=%d", 
    //                         i, j, current, l1Value, l2Value, mergedValue);
    // }
}

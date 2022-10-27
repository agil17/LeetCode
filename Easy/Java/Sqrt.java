public class Sqrt {
    public static void main(String[] args) {
        int x = 144;

        System.out.println(search(x));

    }

    public static int search(int x) {
        if(x == 0 || x == 1) {
            return x;
        }

        int low = 2;
        int high = x;
        int result = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(mid <= x/mid) {
                low = mid + 1;
                result = mid;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
    
}

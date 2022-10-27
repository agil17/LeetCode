public class ClimbingStairs {
    public static void main(String[] args) {
        fib(5);
    }

    public static void fib(int n) {
        int prev1 = 2;
        int prev2 = 1;
        int current = 0;

        for(int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println(current);
    }
}

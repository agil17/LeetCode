package Java;

public class Palindrome {
    public static void main(String[] args) {
        int x = 132 21;
        System.out.println(palindrome(x));


    }

    public static boolean palindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;

        while (start != end && start <= end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
        
    }

    
}

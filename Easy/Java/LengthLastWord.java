package Java;

public class LengthLastWord {
    public static void main(String[] args) {
        int length = lengthLastWord("Hello World");
        System.out.printf("Length of last string: %s", length);
    }

    public static int lengthLastWord(String str) {
        String[] arr = str.split(" ");
        String last = arr[arr.length -1];
        return last.length();
    }
}

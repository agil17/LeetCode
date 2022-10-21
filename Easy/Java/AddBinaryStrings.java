
public class AddBinaryStrings {
    public static void main(String[] args) {
        addBinary("11", "1");
    }

    public static void addBinary(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0) {
            int sum = carry;
            
            if(i >= 0) {
                sum = sum + s1.charAt(i--) - '0';
            }
            if(j >= 0) {
                sum = sum + s2.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        if(carry > 0) {
            sb.insert(0, 1);
        }
        System.out.printf("%s", sb.toString());
    }
}

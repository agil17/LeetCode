package Java;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(validParenthesis("{{{{"));
    }

    public static boolean validParenthesis(String str) {
        Stack st = new Stack();

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' ||
                str.charAt(i) == '[' ||
                str.charAt(i) == '{') {
                    st.add(str.charAt(i));
            }
            else {
                if((char)st.peek() == '(' && str.charAt(i) == ')') {
                    st.pop();
                }
                else if((char)st.peek() == '{' && str.charAt(i) == '}') {
                    st.pop();
                }
                else if((char)st.peek() == '[' && str.charAt(i) == ']') {
                    st.pop();
                }
                else {
                    break;
                }
            }
        }
        if(!st.empty()) {
            return false;
        }
        else {
            return true;
        }
        
    }
}

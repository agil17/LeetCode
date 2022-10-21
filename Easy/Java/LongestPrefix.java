


public class LongestPrefix {
    public static void main(String [] args) {
        String [] s = {"rust", "run", "rut"};
        System.out.println(method(s));
    }

    public static String method(String [] list) {
        StringBuilder prefix = new StringBuilder();
        boolean pre = true;

        int shortestString = list[0].length();
        for(int i = 1; i < list.length; i++) {
            if(shortestString > list[i].length()) {
                shortestString = list[i].length();
            } 
        }
        
        for(int i = 0; i < shortestString; i++) {
            char current = list[0].charAt(i);
            
            for(String str: list) {
                if(str.charAt(i) != current) {
                    pre = false;
                    break;
                }
            }
            if(pre == false){
                break;
            }
            else {
                prefix.append(current);
            }
        }
        return prefix.toString();
    }
}

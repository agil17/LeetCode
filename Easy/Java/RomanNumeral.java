package Java;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    public static void main(String [] args) {
        // do switch case statements and adding over char at for strings
        /*
         *  Input: s = "MCMXCIV"
            Output: 1994
            Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         */
        String str = "X";

        System.out.println( romanToNum(str));
    }

    public static int romanToNum(String str) {
        Map<String, Integer> mp = new HashMap<>();
        int sum = 0;
        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);

        
        for ( int i = 0; i < str.length(); i++ ) {
            if ( i == str.length() - 1 ) {
                sum = sum + mp.get(String.valueOf(str.charAt(i)));
            }
            else if ( mp.get(String.valueOf(str.charAt(i))) >= mp.get(String.valueOf(str.charAt(i+1))) ) {
                sum = sum + mp.get(String.valueOf(str.charAt(i)));
            }
            else {
                sum = sum - mp.get(String.valueOf(str.charAt(i)));
            }
        }
        
        
        return sum;
    }


}
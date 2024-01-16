package LeetCode;

import java.util.HashMap;

public class RomanNumerical {
    public static void main(String[] args) {
        System.out.println(romtonum("IX"));
    }

    static int romtonum(String str){
        HashMap<Character, Integer> rome = new HashMap<>();
        rome.put('I', 1);
        rome.put('V', 5);
        rome.put('X', 10);
        rome.put('L', 50);
        rome.put('C', 100);
        rome.put('D', 500);
        rome.put('M', 1000);
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
                if( i < str.length() - 1 && rome.get(str.charAt(i)) < rome.get(str.charAt(i + 1))){
                    ans = ans - rome.get(str.charAt(i));
                }
                else{
                    ans = ans + rome.get(str.charAt(i));
                }
            }
        return ans;
    }
}
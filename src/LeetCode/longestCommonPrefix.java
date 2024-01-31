package LeetCode;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight", "flat"};
        Arrays.sort(str);
        for(String s : str){
            System.out.println(s);
        }
//        System.out.println(lcp(str));
//        String ans = lcp(str);
//        if(ans.equals("")){
//            System.out.println("No prefix");
//        }else{
//            System.out.println(ans);
//        }
    }

    static String lcp(String[] str) {
        if (str.length == 0) {
            return "";
        }
        if(str.length == 1){
            return str[0];
        }
        String prefix = "";
        int i, j, len = shortest(str);
        for (i = 0; i < len; i++) {
            char x = str[0].charAt(i);
            for (j = 1; j < str.length; j++) {
                if (i >= str[j].length() || x != str[j].charAt(i)) {
                    return prefix;
                }
            }
                prefix += x;
        }
        return prefix;
    }

    static int shortest(String[] str){
        int min = 200;
        for (int i = 0; i < str.length; i++) {
            if(min > str[i].length()){
                min = str[i].length();
            }
        }
        return min;
    }
}

//Best Possible solution

//class Solution {
//    public String longestCommonPrefix(String[] v) {
//        StringBuilder ans = new StringBuilder();
//        Arrays.sort(v);
//        String first = v[0];
//        String last = v[v.length-1];
//        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//            if (first.charAt(i) != last.charAt(i)) {
//                return ans.toString();
//            }
//            ans.append(first.charAt(i));
//        }
//        return ans.toString();
//    }
//}
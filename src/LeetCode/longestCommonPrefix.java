package LeetCode;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"ab", "a"};
//        System.out.println(lcp(str));
        String ans = lcp(str);
        if(ans.equals("")){
            System.out.println("No prefix");
        }else{
            System.out.println(ans);
        }
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

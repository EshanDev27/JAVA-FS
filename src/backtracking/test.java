package backtracking;

public class test {
    public static void main(String[] args) {
        String str = "ABC";
        para(str, "", 0);
    }
    
    public static void para(String str, String par, int idx){
        if(str.length() == 0){
            System.out.println(par);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
        char ans = str.charAt(i);
        String newstr = str.substring(0, i) + str.substring(i + 1);
        para(newstr, par + ans, idx + 1);
        }
    }
}
import java.util.Scanner;

public class StringRevPali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(pali_without_rev(str));
        String newstr;
        newstr = PaliRev(str);
        System.out.println(newstr);
//        PaliRev(str);
    }

    static String pali_without_rev(String old){
        int len = old.length();
        int i = 0, j = len - 1;
        while (i < len / 2){
            if(old.charAt(i) != old.charAt(j)){
                return "String not a plaindrome";
            }
            i++;
            j--;
        }
        return "String is a Palindrome";
    }

    static String PaliRev(String old){
        char[] arr = old.toCharArray();
        int len = old.length();
        for (int i = 0; i < len/2; i++) {
            char temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        String newstr = new String(arr);
//        System.out.println(newstr);
        return newstr;
    }
}
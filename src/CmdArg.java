public class CmdArg {
    public static void main(String[] args) {
//        System.out.println("Hello");
        String ans = "ABSHSHSABASBR";
        int[] arr = new int[26];
        int i = 0;
        while(i != ans.length()) {
            char a = ans.charAt(i);
            arr[a - 'A']++;
            i++;
        }

        for (int j = 0; j < 26; j++) {
            if(arr[j] > 0){
                int x = (j) + 'A';
                char navin = (char) x;
//                System.out.println(navin);
                System.out.println(navin + " : " + arr[j]);
            }
        }
    }
}
//NY house 5 13 21
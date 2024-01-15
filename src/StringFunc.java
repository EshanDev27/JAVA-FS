public class StringFunc {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Eshan");

        //append
        s1.append("Dev");
        System.out.println(s1);

        //insert
        s1.insert(3, "aa");
        System.out.println(s1);

        //reverse()
        s1.reverse();
        System.out.println(s1);

        //replace
        s1.reverse();
        s1.replace(3,5,"");
        System.out.println(s1);
    }
}

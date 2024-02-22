package java8;

import java.util.function.Predicate;

public class predicatedemo {
    public static void main(String[] args) {
        Predicate<String> p = (String s)->s.length() > 0;
        boolean t = p.test("Eshan");
        System.out.println(t);

        int arr[] = {1,2,3,4,5,6,7,8,9};
        Predicate<Integer> p1 = (arg) -> arg%2 == 0;
        Predicate<Integer> p2 = (arg) -> arg%2 != 0;
        for (int i = 0; i < arr.length; i++) {
            if(p2.test(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
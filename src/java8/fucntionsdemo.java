package java8;

import java.util.function.Function;

public class fucntionsdemo {
    public static void main(String[] args) {
        Function<String, Integer> p = (String s) -> s.length();
        Integer a = p.apply("eshan");
        System.out.println(a);
    }
}

package java8;


import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface funcdemo{
    void print();

    default void sum(){
        System.out.println("a + b");
    }
}

//class test{
//    static void print(){
//        System.out.println("new");
//    }
//}

class student{
    String name;
    int id, marks;

    public student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
}

public class steamdemo {
    public static void main(String[] args) {
//        test.print();
        Set<String> set = new TreeSet<>();
        set.add("Eshan");
        set.add("aru");
        set.add("armaan");
        set.add("sihe");
        set.add("maurya");

        List<student> std = Arrays.asList(
                new student("Eshan", 36, 94),
                new student("armaan", 2, 99),
                new student("Maurya", 7, 87),
                new student("Ish", 10, 91),
                new student("Aru", 5, 84));

        List<student> collect1 = std.stream()
                .sorted(Comparator.comparingInt(student::getId).reversed()).collect(Collectors.toList());

        Integer sum = std.stream().mapToInt(student -> student.getMarks()).sum();

        System.out.println(sum);

        System.out.println(collect1.toString());

//        set.stream().map(i -> i + 1)
//                .forEach(System.out::println);

        System.out.println(set.stream().max((o1,o2) -> {
                    return Integer.compare(o1.length(), o2.length());}));
    }
}
package Collections;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class student implements Comparable{
    String name;
    Integer id;

    public student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        student std = (student) o;
        Integer id = std.id;
        return Integer.compare(this.id, id);
    }
}

public class ListCol {
    public static void main(String[] args) {
//        SortedSet<Integer> std= new TreeSet<>();
        // Here we have Integer wrapper class that's why it is getting sorted automatically
        // because "integer" implements Comaprable<> with gives natural sorting order
        // but what if we want to add student Name, id, etc how will it sort in that case
//        std.add(4);
//        std.add(2);
//        std.add(6);
        SortedSet<student> std = new TreeSet<>();
        std.add(new student("Eshan", 8));
        std.add(new student("Aru", 3));
        std.add(new student("Maurya", 10));
//        System.out.println(std.getClass());
        System.out.println(std.toString());
    }
}
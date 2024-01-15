package OOPS;

public class overloading {

    static String name(){
        System.out.println("Eshan");
        return "Eshan";
    }

    static String name(String name){
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        name();
        name("EshanDev");
    }
}

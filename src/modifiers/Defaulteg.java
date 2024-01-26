package modifiers;

class defaultDemo{
    void print(){
        System.out.println("Default Method");
    }

}

public class Defaulteg{
    protected int c = 100; // used in MultiThreading.demo6
    void print(){
        System.out.println("Eshan");
    }
    public static void main(String[] args) {
        defaultDemo demo = new defaultDemo();
        demo.print();
//        demo.a = 4;
//        Defaulteg df = new Defaulteg();
//        df.print();
    }
}

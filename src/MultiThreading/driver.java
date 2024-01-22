package MultiThreading;

class demo2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class driver {
    public static void main(String[] args) {
        demo2 t1 = new demo2();
        System.out.println(t1.getPriority());
        System.out.println(t1.getName());
        t1.setName("Eshan Thread");
        System.out.println(t1.getName());
        t1.setPriority(3);
        System.out.println(t1.getPriority());
    }
}

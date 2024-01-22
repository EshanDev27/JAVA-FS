package MultiThreading;

class demo extends Thread{
    public void run(){
        //Thread Job
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

class NewDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class thread1 {
    public static void main(String[] args) {
//        demo t1 = new demo();
//        t1.start();
        NewDemo demo = new NewDemo();
        Thread t1 = new Thread(demo);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("World");
        }
    }
}
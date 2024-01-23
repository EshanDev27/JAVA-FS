package MultiThreading;

class demo3 extends Thread{
    @Override
    public void run() {
        Thread.yield();     //Temporarily stops the Thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning");
        try{
        Thread.sleep(1200);
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
}

public class yield_Thread {
    public static void main(String[] args) {
        demo3 t1 = new demo3();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Beautiful");
        }
    }
}

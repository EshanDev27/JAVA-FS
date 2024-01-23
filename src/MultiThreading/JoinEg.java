package MultiThreading;

class join1 extends Thread{
    Thread t1;
    join1(){}
    join1(Thread t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
        try {
            t1.join(); // t1(or whichever thread is passed into the constructor will run first and then join1 thread)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1");
        }
    }
}

class join2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2");
        }
    }
}

public class JoinEg {
    public static void main(String[] args) throws InterruptedException{
        join2 t2 = new join2();
        join1 t1 = new join1(t2);
        t1.start();
        t2.start();
        //        t1.join();

    }
}

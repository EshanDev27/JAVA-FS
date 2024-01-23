package MultiThreading;

class msg{
    public void m1(){
    // public synchronized void m1(){  Method Synchronization
        for (int i = 0; i < 5; i++) {
            synchronized (this){ //Block Synchronization
                System.out.println("Hello " + Thread.currentThread().getName());
                try{
                    Thread.sleep(600);
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("World " + Thread.currentThread().getName());
            }
        }
    }
}

class syncThread extends Thread{
    msg p;
    syncThread(msg p){
        this.p = p;
    }
    @Override
    public void run() {
        p.m1();
    }
}

public class sync {
    public static void main(String[] args) {
        msg p = new msg();
        syncThread t1 = new syncThread(p);
        t1.setName("Thread A");
        syncThread t2 = new syncThread(p);
        t2.setName("Thread B");
        t1.start();
        t2.start();
    }
}

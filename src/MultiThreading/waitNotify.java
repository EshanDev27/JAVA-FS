package MultiThreading;

class cnt {
    int cnt = 0;
    boolean valueSet = false;

    public synchronized void put(int cnt) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        valueSet = true;
        this.cnt = cnt;
        System.out.println("Produced : " + cnt);
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        valueSet = false;
        System.out.println("Consumed : " + cnt);
        notify();
    }
}

class producer implements Runnable {
    cnt p;

    producer(cnt p) {
        this.p = p;
        Thread t = new Thread(this);  // Pass this to the Thread constructor
        t.start();  // Properly start the thread
    }

    int i = 0;

    @Override
    public void run() {
        synchronized (p) {  // Use synchronized on shared object 'p'
            while (true) {
                try {
                    p.put(i++);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Produced : " + p.cnt);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class consumer implements Runnable {
    cnt p;

    consumer(cnt p) {
        this.p = p;
        Thread t = new Thread(this);  // Pass this to the Thread constructor
        t.start();  // Properly start the thread
    }

    @Override
    public void run() {
        synchronized (p) {  // Use synchronized on shared object 'p'
            while (true) {
                try {
                    p.get();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumed : " + p.cnt);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class waitNotify {
    public static void main(String[] args) {
        cnt p = new cnt();
        producer pro = new producer(p);
        consumer con = new consumer(p);
    }
}

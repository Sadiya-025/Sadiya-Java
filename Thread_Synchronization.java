class SynchronizedResource {
    private int value = 0;

    public synchronized void increment() {
        for (int i = 0; i < 10000; i++) {
            value = value + 1;
        }
        System.out.println("Increment Complete!");
    }

    public synchronized void decrement() {
        for (int i = 0; i < 10000; i++) {
            value = value - 1;
        }
        System.out.println("Decrement Complete!");
    }

    public synchronized int getValue() {
        return value;
    }
}

public class Thread_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedResource synchronizedResource = new SynchronizedResource();
        Thread thread1 = new Thread(() -> synchronizedResource.increment());
        Thread thread2 = new Thread(() -> synchronizedResource.decrement());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Value: " + synchronizedResource.getValue());
    }
}

//Demonstrate isAlive  and join method for multiple threads using runnable interface

class ThreadMethods implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is Running...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    public static void status(Thread thread) {
        System.out.println(thread.getName() + " is Alive? " + thread.isAlive());
    }

    public static void main(String[] args) {
        Thread thread0 = new Thread(new ThreadMethods());
        Thread thread1 = new Thread(new ThreadMethods());
        Thread thread2 = new Thread(new ThreadMethods());
        status(thread0);
        status(thread1);
        status(thread2);

        System.out.println(thread0.getName() + " is Starting...");
        thread0.start();
        status(thread0);
        try {
            thread0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!thread0.isAlive()) {
            System.out.println("Thread-0 Stopped Running...");
            status(thread0);
        }

        System.out.println(thread1.getName() + " is Starting...");
        thread1.start();
        status(thread1);
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!thread1.isAlive()) {
            System.out.println("Thread-1 Stopped Running...");
            status(thread1);
        }

        System.out.println(thread2.getName() + " is Starting...");
        thread2.start();
        status(thread2);
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!thread2.isAlive()) {
            System.out.println("Thread-2 Stopped Running...");
            status(thread2);
        }
    }
}

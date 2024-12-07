import java.lang.Runnable;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(taskName + " Running, Count - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Advanced_Multithreading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread-1"));
        thread1.start();
        Thread thread2 = new Thread(new Task("Thread-2"));
        thread2.start();
    }
}

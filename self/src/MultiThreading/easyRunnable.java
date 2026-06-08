package MultiThreading;

public class easyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread task 2");
    }

    public static void main(String[] args) {
        easyRunnable e =new easyRunnable();
        Thread th =new Thread(e);
        th.start();
    }
}

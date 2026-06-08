class MyThread extends Thread {
    public MyThread(String name) {
        super(name);  // Set the thread name
    }

    public void run() {
        System.out.println("Thread " + getName() + " is running with priority " + getPriority());
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create 8 threads with different names and priorities
        MyThread t1 = new MyThread("Alpha");
        MyThread t2 = new MyThread("Beta");
        MyThread t3 = new MyThread("Gamma");
        MyThread t4 = new MyThread("Delta");
        MyThread t5 = new MyThread("Epsilon");
        MyThread t6 = new MyThread("Zeta");
        MyThread t7 = new MyThread("Eta");
        MyThread t8 = new MyThread("Theta");
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t6.setPriority(6);
        t7.setPriority(7);
        t8.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}

package multithreading;
class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {}
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(5000); // 5 seconds
            } catch (InterruptedException e) {}
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}

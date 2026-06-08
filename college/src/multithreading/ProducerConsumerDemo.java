class SharedData {
    int data;
    boolean hasValue = false;
    synchronized void produce(int value) {
        while (hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        System.out.println("Produced: " + data);
        hasValue = true;
        notify();
    }
    synchronized void consume() {
        while (!hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        hasValue = false;
        notify();
    }
}
class Producer extends Thread {
    SharedData shared;
    Producer(SharedData shared) {
        this.shared = shared;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedData shared;
    Consumer(SharedData shared) {
        this.shared = shared;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.consume();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedData shared = new SharedData();
        Producer p = new Producer(shared);
        Consumer c = new Consumer(shared);
        p.start();
        c.start();
    }
}

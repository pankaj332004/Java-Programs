class Sender {
    public void send(String message) {
        System.out.println("Sending: " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Sent: " + message);
    }
}
class SenderThread extends Thread {
    private String message;
    private Sender sender;

    SenderThread(String msg, Sender obj) {
        message = msg;
        sender = obj;
    }

    public void run() {
        synchronized(sender) {
            sender.send(message);
        }
    }
}
public class MessageSenderDemo {
    public static void main(String[] args) {
        Sender sharedSender = new Sender();

        SenderThread t1 = new SenderThread("Hello", sharedSender);
        SenderThread t2 = new SenderThread("Welcome", sharedSender);
        SenderThread t3 = new SenderThread("Goodbye", sharedSender);

        t1.start();
        t2.start();
        t3.start();
    }
}

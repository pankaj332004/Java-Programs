package MultiThreading;

public class DaemonThread extends  Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else{
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread");
        DaemonThread d = new DaemonThread();
//        d.setDaemon(true);
        d.start();
        d.setDaemon(true);
    }
}

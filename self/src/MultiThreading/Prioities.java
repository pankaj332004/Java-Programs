package MultiThreading;

public class Prioities extends Thread{
    public void run(){
        System.out.println("Child thread");
        System.out.println("child thread Priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Old Priority of the main : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(NORM_PRIORITY);
        System.out.println("New Priority of the main : "+Thread.currentThread().getPriority());
        Prioities p = new Prioities();
        p.setPriority(6);
        p.start();
    }
}

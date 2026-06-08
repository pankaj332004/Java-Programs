package MultiThreading;

public class easyThread  extends Thread{
    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args){
        easyThread e = new easyThread();
        e.start();
        easyThread e2 =new easyThread();
        e2.start();
       // e.start(); give Exception
    }
}

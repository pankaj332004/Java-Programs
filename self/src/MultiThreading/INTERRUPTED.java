package MultiThreading;

public class INTERRUPTED extends Thread {
    public void run(){
        //System.out.println("1 : "+Thread.interrupted());// true -> false
        System.out.println("1 : "+Thread.currentThread().isInterrupted()); // true
        try{
            for(int i=1; i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                //System.out.println("2 : "+Thread.interrupted());
                System.out.println("2 : "+Thread.currentThread().isInterrupted());
            }
        }
        catch (Exception e){
            System.out.println("Thread Interrupted : "+e);
        }
    }

    public static void main(String[] args) {
        INTERRUPTED it = new INTERRUPTED();
        it.start();
        it.interrupt();
    }

}

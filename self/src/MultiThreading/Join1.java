package MultiThreading;

public class Join1 extends Thread{
    static  Thread mainThread;
    public void run(){
        try{
            mainThread.join();
            for(int i=1;i<=5;i++){
                System.out.println("Child thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        mainThread = Thread.currentThread();
        Join1 j = new Join1();
        j.start();
        //j.join();
        try{
            for (int i=1;i<=5;i++){
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

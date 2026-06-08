package MultiThreading;

public class sleep2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i+" : "+Thread.currentThread().getName());
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        sleep2 s =new sleep2();
        s.start();
        sleep2 s2 = new sleep2();
        s2.start();
    }
}

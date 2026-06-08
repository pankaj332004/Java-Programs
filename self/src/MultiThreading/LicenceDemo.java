package MultiThreading;

class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical starts ");
            Thread.sleep(3000);
            System.out.println("Medical completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("TestDrive starts ");
            Thread.sleep(5000);
            System.out.println("TestDrive completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Officer takes the file");
            Thread.sleep(3000);
            System.out.println("Officer works completed");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException{
        Medical m = new Medical();
        m.start();
        m.join();

        TestDrive td = new TestDrive();
        td.start();
        td.join();

        OfficerSign os = new OfficerSign();
        os.start();

    }
}

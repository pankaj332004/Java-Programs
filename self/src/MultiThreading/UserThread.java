package MultiThreading;

public class UserThread extends Thread {
    public void run(){
        System.out.println("Thread task : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello : "+Thread.currentThread().getName());
        UserThread u1 = new UserThread();
        u1.setName("Pankaj");
        u1.start();
        //System.out.println(u.getName());
        UserThread u2 = new UserThread();
        u2.setName("Company");
        u2.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(u1.isAlive());
    }
}

package MultiThreading;

public class Threadname {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Pankaj");
        System.out.println("New Thread name : "+Thread.currentThread().getName());
    }
}

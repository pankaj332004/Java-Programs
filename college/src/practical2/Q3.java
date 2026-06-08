package practical2;

public class Q3 {
    // non static method
    void f1(){
        System.out.println("Hello Students welcome to the new semester");
    }
    // static method
    static void f2(){
        System.out.println("Hello Students welcome to the new semester");
    }
    public static void main(String[] args) {
        f2();
        Q3 t= new Q3();
        t.f1();
    }
}

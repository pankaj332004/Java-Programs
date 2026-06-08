public class test {
    static void f(){
        System.out.println("Hello");
    }
    void f2(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        f();
        test t = new test();
        t.f2();
        sample.f3();
        sample s = new sample();
        s.f4();
    }
}

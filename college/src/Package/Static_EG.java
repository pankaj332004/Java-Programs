package Package;
import static Package.pack1.A.*;
class tes {
    public static void hello() {
        System.out.println("Printing hello");
    }

    public void merge() {
        System.out.println("In class test");
    }
}
class Static_EG {
    public static void main(String[] args) {
        tes t =new tes();
        t.merge();
        tes.hello();
        displayA();
    }

}

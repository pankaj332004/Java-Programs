package OOPSdecode;
class Parent{
    public void proprerty(){
        System.out.println("Loan + gold +cash");
    }
    public void marry(){
        System.out.println("Relative Girl");
    }
}
class Child extends Parent{
    // Overriding
    public void marry(){
        // Re implementation
        System.out.println("SomeOther Girl...");
    }
}
public class overRiding {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.proprerty();
        p1.marry();

        System.out.println();

        Child c1 = new Child();
        c1.proprerty();
        c1.marry();

        System.out.println();

        Parent p2 = new Child();
        p2.proprerty();
        p2.marry();
    }
}

package Inheritence;

public class B extends A{
    B(){
        super();
        System.out.println("Child constructor ");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

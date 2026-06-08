package exceptionhand;

public class gaaaaa {
    public static void main(String[] args) {
        gaaaaa g = new gaaaaa();
        try{
            g.divide();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
    void divide(){
        int a =100, b= 0, c;
        c = a/b;
        System.out.println(c);
    }
}

package Inheritence;

interface simple_calculator {
    void addition();
    void multiplication();
    void subtraction();
}
class C1 implements simple_calculator{
    int a , b ;
    C1(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void addition(){
        System.out.println("Addition="+(a+b));
    }
    public void multiplication(){
        System.out.println("Multiply ="+(a*b));
    }
    public void subtraction(){
        System.out.println("Sub="+(a-b));
    }
}
class C2 implements simple_calculator{
    double a , b;
    C2(double a , double b){
        this.a = a;
        this.b = b;
    }
    public void addition(){
        System.out.println("Addition="+(a+b));
    }
    public void multiplication(){
        System.out.println("Multiply ="+(a*b));
    }
    public void subtraction(){
        System.out.println("Sub="+(a-b));
    }
}
class  SI_EG{
    public static void main(String[] args) {
        C1 t=new C1(10,5);
        C2 s = new C2(10.2,5.6);
        t.addition();
        t.multiplication();
        t.subtraction();
        s.addition();
        s.multiplication();
        s.subtraction();
    }
}

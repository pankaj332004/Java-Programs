package OOPSdecode;
class Calculator1
{
    public void add(int a, int b){
        System.out.println("int-int argument");
    }
    public void add(float a , float b){
        System.out.println("float-float argument");
    }
    public void add(double a,double b){
        System.out.println("double-double argument");
    }
    public void add(int a, float b){
        System.out.println("int-float argument");
    }
    public void add(float a ,int b){
        System.out.println("float-int argument");
    }
}
public class staticPolymorphism {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add(10,20);// int-int
        c.add(10.0,20.0);// double-doulbe
        c.add(1.2f,2.2f);// float-float
        c.add('a','c');
        c.add(10,20);
    }
}

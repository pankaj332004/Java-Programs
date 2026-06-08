package OOPSdecode;

interface ICalculate{
    void add(int a, int b);
    void sub(int a,int b);
}
interface  AdvanceCalculate extends ICalculate{
    void mul(int a, int b);
    void div(int a ,int b);
}
class ImplCalculate implements  AdvanceCalculate{
    @Override
    public void add(int a, int b) {
        System.out.println("Add is : "+(a+b));
    }
    @Override
    public void sub(int a, int b) {
        System.out.println("Sub is : "+(a+b));
    }
    @Override
    public void mul(int a, int b) {
        System.out.println("Mul is : "+(a+b));
    }
    @Override
    public void div(int a, int b) {
        System.out.println("Div is : "+(a+b));
    }
}
public class extendsANDimplements {
    public static void main(String[] args) {
        AdvanceCalculate cal = new ImplCalculate();
        cal.add(10,20);
        cal.sub(20,10);
        cal.mul(2,3);
        cal.div(6,2);
    }

}

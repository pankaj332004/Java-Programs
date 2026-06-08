package OOPSdecode;
class calculator{
    public void add(int a , int b){
        int ans = a+b;
        System.out.println("The sum is :: "+ans);
    }
}
// local variable are declare inside the method
// memory will be given in the stack area
public class localVariable {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(10,20);
    }
}

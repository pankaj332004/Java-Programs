package OOPSdecode;
class LoanApp{
    static float rateOfInterest = 9.5f;
}
// memory  will be given in the method area
// static variable can be accessed in 2 ways
//a. using class name
//b. using reference of the object
public class staticVariable {
    public static void main(String[] args) {
        System.out.println(LoanApp.rateOfInterest);
        System.out.println(new LoanApp().rateOfInterest);
    }
}

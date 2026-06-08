package OOPSdecode;

// Interfaces :-
// 1. In java interface has been introduce to  provide "SRS"
//    SRS -> Software Requirement Specifications

// 2. In java interfaces would act like a contract b/w the client and the service provider
// In java interfaces also represents the mechanism to put rules from the client end to the service provider
// eg . -> JDBC API (rule given by SUNMS ) to the database vendors like MYSQL , Oracle , Sybase...
// Servlet API (rule given by SUNMS ) for the server vendors like Tomcat , Glassfish , JBoss...

// 3. In java interfaces always represents 100%  abstractions .
//  -> Inside java interfaces we can write only  abstract methods , we can't write concrete methods

// Note : Inside inteface the methods we write always indicates "public and abstract" .
//interface  ICalculator{
//    // public abstract
//    public void add(int a, int b);
//    public void sub(int a, int b);
//    public void mul(int a, int b);
//    public void div(int a, int b);
//}

// 4. interface should be implemented by  a class.
//  -> which ever class is implementing an interfaces that class should compulsorily give the body for all the abstract methods
// present in the interfaces
// -> if the implementation class fails to give the body for atleast one abstract methods then that class would become abstract class

//interface  ICalculator{
//    // public abstract
//    public void add(int a, int b);
//    public void sub(int a, int b);
//    public void mul(int a, int b);
//    public void div(int a, int b);
//}
//abstract class CalculatorImpl implements ICalculator{
//
//}

interface  ICalculator{
    // public abstract
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}
class CalculatorImpl implements ICalculator{
    @Override
    public void add(int a, int b) {
        System.out.println("The sum is : "+(a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("The sub is : "+(a-b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("The mul is : "+(a*b));
    }
    public void div(int a ,int b){
        System.out.println("The div is : "+(a/b));
    }
}
public class interfaces {
    public static void main(String[] args) {
        // loose coupling  : Polymorphism
        ICalculator ref = new CalculatorImpl();
        ref.add(10,200);
        ref.sub(20,3);
        ref.mul(5,9);
        ref.div(187,11);
    }
}

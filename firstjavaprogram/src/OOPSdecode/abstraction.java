package OOPSdecode;

// In java abstraction can be achived using the
// a. abstract
// b. interface

// In real world for few cases object should not ne created , to handle such scenarios in the java we need go for a keyword called "abstract"
//abstract access modifier can be applied at
// a. class level -> yes possible , if we make as abstract then object can't be instantiated
// b. method level -> yes possible , if we make as abstract , then we can't give body for the method
// c. variable level -> no we can't use abstract at variable level.


abstract class plane1{
    public abstract void tookOff();
    public abstract void fly();
    public abstract void landing();
}
class PassengerPlane1 extends plane1{
    public void tookOff() {
        System.out.println("PassengerPlane tookOff");
    }

    public void fly() {
        System.out.println("PassengerPlane is Flying");
    }

    public void landing() {
        System.out.println("PassengerPlane is landing");
    }
}
class CargoPlane1 extends plane1{
    public void tookOff() {
        System.out.println("CargoPlane tookOff");
    }

    public void fly() {
        System.out.println("CargoPlane is Flying");
    }

    public void landing() {
        System.out.println("CargoPlane is landing");
    }
}
class FighterPlane1 extends plane1{
    public void tookOff() {
        System.out.println("FighterPlane tookOff");
    }

    public void fly() {
        System.out.println("FighterPlane is Flying");
    }

    public void landing() {
        System.out.println("FighterPlane is landing");
    }
}
class Airport1{
    public void allowPlane(plane1 ref){
        ref.tookOff();
        ref.fly();
        ref.landing();

        System.out.println();
    }
}
public class abstraction {
    public static void main(String[] args) {
        Airport1 a = new Airport1();
        a.allowPlane(new PassengerPlane1());
        a.allowPlane(new CargoPlane1());
        a.allowPlane(new FighterPlane1());
    }
}
// rules of abstract modifier can be applied at
// 1. If a class contains at least  one abstract method , then mark the class as "abstract".
// 2. abstract class can't be instantiated.
// 3. for an abstract class we can create a reference but not the object
// 4. Inside abstract class we can write concrete method also.
// 5. If a parent class is abstract , then compulsorily  the child class should give the implementaion for all the abstract methods
// otherwise the child class also would  become "abstract "
// 6. Even if the class dosen't contains abstract methods still we can marks the class as the "abstract"
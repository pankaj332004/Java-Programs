package OOPSdecode;

class plane{
    public void tookOff(){
        System.out.println("Plane Took off");
    }
    public void fly(){
        System.out.println("Plane is Flying");
    }
    public void landing(){
        System.out.println("Plane is Landing");
    }
}
class passengerPlane extends plane{
    public void tookOff(){
        System.out.println("Passenger plane Took Off");
    }
    public void fly(){
        System.out.println("Passenger plane is Flying");
    }
    public void landing(){
        System.out.println("Passenger Plane is Landing");
    }
}
class CargoPlane extends plane{
    public void tookOff(){
        System.out.println("Cargo plane Took Off");
    }
    public void fly(){
        System.out.println("Cargo plane is Flying");
    }
    public void landing(){
        System.out.println("Cargo Plane is Landing");
    }
}
class FighterPlane extends plane{
    public void tookOff(){
        System.out.println("Fighter plane Took Off");
    }
    public void fly(){
        System.out.println("Fighter plane is Flying");
    }
    public void landing(){
        System.out.println("Fighter Plane is Landing");
    }
}
class Airport{
    // True Plymorphism
    public void allowPlane(plane p){
        p.tookOff();
        p.fly();
        p.landing();

        System.out.println();
    }
}
public class palneOverRiding {
    public static void main(String[] args) {

        passengerPlane p =new passengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport ap = new Airport();
        ap.allowPlane(p);
        ap.allowPlane(c);
        ap.allowPlane(f);

    }
}

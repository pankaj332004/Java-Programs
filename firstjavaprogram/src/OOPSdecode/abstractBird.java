package OOPSdecode;
abstract class Bird{
    public abstract void fly();
    public abstract void eats();
}
class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow fly at short height");
    }
    public void eats(){
        System.out.println("Sparrow eats grains");
    }
}
abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle fly at very very height");
    }
    public abstract void eats();
}
class SerpentEagle extends Eagle{
    @Override
    public void eats() {
        System.out.println("Serpent Eagle eats snake");
    }
}
class GoldenEagle extends Eagle{
    public void eats(){
        System.out.println("Golden eagle catches prey over the ocean");
    }
}
class Crow extends Bird{
    @Override
    public void fly() {
        System.out.println("Crow fly at medium height");
    }

    @Override
    public void eats() {
        System.out.println("Crow eats grains");
    }
}

class Sky{
    public void allowBird(Bird ref){
        ref.eats();
        ref.fly();
        System.out.println();
    }
}
public class abstractBird {
    public static void main(String[] args) {
        Sky s = new Sky();
        s.allowBird(new Sparrow());
        s.allowBird(new SerpentEagle());
        s.allowBird(new GoldenEagle());
        s.allowBird(new Crow());
    }
}
// Note :-
// 1. abstract class contains concrete methods and abstract methods so, we say through abstract class 100% abstraction can't be achieved
// 2. To achieve 100% abstraction we need to go for "interfaces".
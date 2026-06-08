package exceptionhand;

public class UnderAgeException2 extends RuntimeException {
    UnderAgeException2(){
        super("You are under age");
    }
    UnderAgeException2(String message){
        super(message);
    }
}

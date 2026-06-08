package exceptionhand;

public class Voting2 {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age<18){
                throw new UnderAgeException2("You cannot vote as your age is below 18");
            }
            else{
                System.out.println("You can vote now. . . !!");
            }
        }
        catch (UnderAgeException2 e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}

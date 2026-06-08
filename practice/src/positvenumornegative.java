import java.util.Scanner;

public class positvenumornegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.print("Entered number is positive");
        }
        else{
            System.out.print("Entered number is negative");
        }
    }
}

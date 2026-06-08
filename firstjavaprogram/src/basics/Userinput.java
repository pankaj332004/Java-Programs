package basics;
import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(n*n);
    }
}

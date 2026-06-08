import java.util.Scanner;

public class even_divisible_by3 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num%2==0  && num%3==0){
            System.out.println("number is even and divisible by 3 : "+num);
        }
    }
}

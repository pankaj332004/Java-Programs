import java.util.Scanner;

public class divisible_by_3_or_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the numbered :");
        int num = sc.nextInt();

        if(num%3==0 || num%5==0){
            System.out.println("Number is divisible by 3 or 5 : "+num);
        }
    }
}

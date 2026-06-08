import java.util.Scanner;

public class print_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a= sc.nextInt();

        System.out.println("Enter the second number : ");
        int b= sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println(i+","+j);
            }
            System.out.println();
        }
    }
}

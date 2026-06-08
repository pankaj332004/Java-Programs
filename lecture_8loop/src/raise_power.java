import java.util.Scanner;

public class raise_power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number a:");
        int a= sc.nextInt();

        System.out.println("Enter the number b:");
        int b= sc.nextInt();

        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println(ans);
    }
}

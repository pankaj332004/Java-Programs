import java.util.Scanner;

public class natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num= sc.nextInt();

        int n=1;
        while(n<=num){
            System.out.println(n);
            n=n+1;
        }
    }
}


import java.util.Scanner;

public class natural_break_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num= sc.nextInt();

        int n=1;
        while(n<=num){
            if(n==5) {
                break;
            }
            System.out.println(n);
            n=n+1;
        }
    }
}


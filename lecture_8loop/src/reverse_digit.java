import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int n=sc.nextInt();

        int num,rev=0;
        while(n!=0){
            num=n%10;
            rev=10*rev + num;
            n=n/10;
        }
        System.out.println("reverse digit is : "+rev);
    }
}

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int n= sc.nextInt();

        int sum=0,num;
        while(n!=0){
            num=n%10;
            n=n/10;
            sum=sum+num;
        }
        System.out.println(sum);
    }
}

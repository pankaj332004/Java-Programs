import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal_num=sc.nextInt();

        int ans = 0;
        int power = 1;

        while(decimal_num>0){
            int parity = decimal_num%8;
            ans = ans +(parity *power);
            decimal_num /=8;
            power *=10;
        }
        System.out.println("octal number is : "+ans);
    }
}


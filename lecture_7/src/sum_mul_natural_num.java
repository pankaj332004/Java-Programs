import java.util.Scanner;

public class sum_mul_natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int num= sc.nextInt();
        int n=0;
        for(int i=1;i<=num;i++){
            n=n+(i*num);
        }
        System.out.println(n);

    }
}

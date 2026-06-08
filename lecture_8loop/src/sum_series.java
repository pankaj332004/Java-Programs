import java.util.Scanner;

public class sum_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        int sum=0,i;
        for(i=1;i<=num;i++) {
            if (i % 2 == 0) {
                sum=sum-i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}

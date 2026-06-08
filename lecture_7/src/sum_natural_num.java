import java.util.Scanner;

public class sum_natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number , num");
        int num= sc.nextInt();

        int n=1,x=0;
        while(n<num){
            x=x+n;
            n++;
        }
        System.out.println("sum of natural number up to num is :"+x);
    }
}

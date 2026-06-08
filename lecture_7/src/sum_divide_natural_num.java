import java.util.Scanner;

public class sum_divide_natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the natural number : ");
        int num= sc.nextInt();

        int i=1,j=0;
        do{
            j=j+num/i;
            i++;
        }while(i<=num);
        System.out.println(j);
    }
}

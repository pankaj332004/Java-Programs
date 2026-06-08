import java.util.Scanner;

public class divide_natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num= sc.nextInt();

        int i=1;
                do{
                    System.out.println(num/i);
                    i++;
                }while(i<=num);
    }
}

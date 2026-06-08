import java.util.Scanner;

public class number_rectangular_pattern {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        int r= sc.nextInt();

        System.out.println("Enter the number columns : ");
        int c= sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

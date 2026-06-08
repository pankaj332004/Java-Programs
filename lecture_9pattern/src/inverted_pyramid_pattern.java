import java.util.Scanner;

public class inverted_pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();

        for(int i=1;i<=r;i++){
            //print spaces
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            //print stars2*i-1
            for(int j=1;j<=2*(r-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

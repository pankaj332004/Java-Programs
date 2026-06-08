import java.util.Scanner;

public class numerical_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();


        for(int i=1;i<=r;i++){
            // print space
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            // print number
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            //print number
            for(int l=i-1;l!=0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

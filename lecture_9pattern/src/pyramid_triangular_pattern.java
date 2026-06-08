import javax.xml.transform.Source;
import java.util.Scanner;

public class pyramid_triangular_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();

        for(int i=1;i<=r;i++){// traversing over rows

            // print r-i spaces
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            // print star 2*i-1
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

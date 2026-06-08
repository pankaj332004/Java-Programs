import java.util.Scanner;

public class two_number_rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int c= sc.nextInt();

//        for(int i=1;i<=r-(r/2);i++){
//            for(int j=1;j<=c-(c/2);j++){
//                System.out.print(12);
//            }
//            System.out.println();
//            for(int k=1;k<=c-(c/2);k++){
//                System.out.print(21);
//            }
//            System.out.println();
//        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}

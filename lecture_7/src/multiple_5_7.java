//using if else statement
import java.util.Scanner;

public class multiple_5_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num= sc.nextInt();

//        if(num%5==0 && num%7==0){
//            System.out.println("Entered  number is multiple of 5 and 7: "+num);
//        }
//        else{
//            System.out.println("Entered number is not the multiple of 5 and 7");
//        }
        for(int i=1;i<num;i++){
            if(i%5==0 && i%7==0){
                System.out.println(i);
                break;
            }
        }
    }
}

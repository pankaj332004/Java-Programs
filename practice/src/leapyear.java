import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if(year%400==0  || (year%4==0 && year%100!=0)){
            System.out.print("Given year is leap year");
        }
        else{
            System.out.print("Given year is not leap year");
        }
    }
}

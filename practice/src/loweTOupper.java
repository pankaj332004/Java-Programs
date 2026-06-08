import java.util.Scanner;

public class loweTOupper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lowercase of the CHaracter : ");
        char ch =sc.next().charAt(0);
        int num = (char)ch-32;
        System.out.print("Uppercase is : "+(char)num);
    }
}

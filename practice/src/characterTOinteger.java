import java.util.Scanner;

public class characterTOinteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        //int num = (char)ch;
        System.out.print("ASCII value : "+(int)ch);
    }
}

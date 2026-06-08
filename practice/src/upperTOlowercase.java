import java.util.Scanner;

public class upperTOlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the uppercase Character : ");
        char ch=sc.next().charAt(0);
        int num =(char)ch+32;
        System.out.print("Lowercase character wiLl be : "+ (char)num);
    }
}

import java.util.Scanner;

public class largest_in_3number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number a:");
        int a = sc.nextInt();

        System.out.println("Enter the number b:");
        int b = sc.nextInt();

        System.out.println("Enter the number c:");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greatest number:"+a);
            }
            else {
                System.out.println("c is greatest number :"+c);
            }
        }
        else{
            if(b>c){
                System.out.println("b is greatest number:"+b);
            }
            else{
                System.out.println("c is greatest number:"+c);
            }
        }
    }
}

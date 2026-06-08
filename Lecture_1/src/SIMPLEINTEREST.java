import java.util.Scanner;

public class SIMPLEINTEREST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle");
        float p = sc.nextFloat();

        System.out.println("Enter the rate of interest");
        float r =sc.nextFloat();

        System.out.println("Enter the time");
        float t = sc.nextFloat();

        float si= (p * t * r)/100;

        System.out.println("Simple Interest is :"+si);
    }
}

package conditional;

import java.util.Scanner;

public class ageRSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram : ");
        int r = sc.nextInt();
        System.out.print("Enter the age of Shyam : ");
        int s = sc.nextInt();
        System.out.print("Enter the age of Ajay : ");
        int a = sc.nextInt();
        if(r<s && r<a){
            System.out.print("Ram is youngest");
        }
        else if (s<r && s<a) {
            System.out.print("Shyam is youngest");
        }
        else if (a<s && a<r) {
            System.out.print("Ajay is youngest");
        }
        else{
            System.out.print("Everyone have equal ages");
        }
    }
}

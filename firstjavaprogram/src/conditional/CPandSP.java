package conditional;

import java.util.Scanner;

public class CPandSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price of the product : ");
        int cp = sc.nextInt();
        System.out.print("Enter the Selling price of the product : ");
        int sp = sc.nextInt();
        if(cp>sp){
            System.out.print("Incurred loss : "+(cp-sp));
        }
        else if (cp<sp) {
            System.out.print("Made profit : "+(sp-cp));
        }
        else{
            System.out.print(" No profit and No loss : "+0);
        }
    }
}

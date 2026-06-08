package conditional;

import java.util.Scanner;

public class origin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x point : ");
        int x = sc.nextInt();
        System.out.print("Enter the y point : ");
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.print("1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.print("2nd quadrant");
        }
        else if(x<0 && y<0){
            System.out.print("3rd quadrant");
        }
        else if(x>0 && y<0){
            System.out.print("4th quadrant");
        }
        else if(x!=0 && y==0){
            System.out.print("x - axis");
        }
        else if(x==0 && y!=0){
            System.out.print("y=axis");
        }
        else{
            System.out.print("Origin");
        }
    }
}

package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found is: ");
        int x=sc.nextInt();

        // solution
        boolean flag = false; // means not found
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag = true;
                //System.out.print("Element found at the position "+(i+1)+" is "+x);
                break;
            }
        }
        if(flag == true) System.out.print("Element found: ");
        else System.out.print("Element not found");
    }
}

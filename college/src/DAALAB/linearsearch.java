package DAALAB;
import java.util.Scanner;

public class linearsearch {
    public static int linear(int[] arr, int i,int target){
        if(i>= arr.length) {
            return -1;
        }
        if(arr[i] == target) return i;
        return linear(arr,i+1,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int target = sc.nextInt();

        int res = linear(arr,0,target);
        System.out.println(res==-1?"not found":"Found at index : "+res);
        System.out.println("Pankaj Kumar Rajbhar");
        System.out.println("2300320130170");
    }
}

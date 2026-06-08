package Recursion;

public class Printarray {
    public static void print(int i , int[] arr){
        if(i== arr.length) return;
        print(i+1,arr);
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        print(0,arr);
        int ele = 1;
        System.out.println(exist(0,arr,ele));
    }
    public static boolean exist(int i ,int[] arr , int ele){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==ele){
            return true;
        }
        return exist(i+1,arr,ele);
    }
}

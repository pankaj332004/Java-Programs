package Recursion;

public class reverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr,0,arr.length-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void reverse(int[] arr,int left , int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr ,left+1, right-1);
    }
}

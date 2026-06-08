package Sorting;

public class sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean flag =true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println("Unsoretd");
    }
}

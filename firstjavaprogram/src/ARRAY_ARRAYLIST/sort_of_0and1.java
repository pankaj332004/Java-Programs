package ARRAY_ARRAYLIST;

import java.util.Arrays;

public class sort_of_0and1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 0, 0, 1, 0};
        int n=arr.length;
//        Arrays.sort(arr);
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }

//        int noOFones = 0;
//        int noOFzeros = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOFzeros++;
//            else noOFones++;
//        }
//        for(int i=0;i<noOFzeros;i++){
//            arr[i] = 0;
//        }
//        for(int i=noOFzeros;i<n;i++){
//            arr[i] = 1;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // method 2 one pass solution
        int i = 0, j = n-1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            //if(i>j) break;
            else if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}

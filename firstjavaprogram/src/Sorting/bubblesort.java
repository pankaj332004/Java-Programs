package Sorting;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2};
        int n= arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        // bubble sort 1
//        for (int x =1;x<=n-1;x++){
//            for (int i=0;i<n-1;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        // bubble sort 2
//        for (int x =0;x<n-1;x++){
//            for (int i=0;i<n-1-x;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        // optimized bubble sort
        for (int x =0;x<n-1;x++){
            boolean flag = true;
            for (int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
//        System.out.println();
//        for(int x =0 ;x<n-1;x++){
//            for(int i=n-1-x;i>0;i--){
//                if(arr[i]>arr[i-1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i-1];
//                    arr[i-1] = temp;
//                }
//            }
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
    }
}

package Sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,7,-6,8};
        int n = arr.length;
        for (int ele : arr){
            System.out.print(ele+" ");
        }
//        for(int i=1;i<n;i++){
//            for(int j=i;j>=1;j--){
//                if(arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//                else break;
//            }
//        }
        for(int i=1;i<n;i++){
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println();
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

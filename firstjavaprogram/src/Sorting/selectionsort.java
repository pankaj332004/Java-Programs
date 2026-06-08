package Sorting;

public class selectionsort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
//        for(int i=0;i<n-1;i++){
//            int min = Integer.MAX_VALUE;
//            int mindx = -1;
//            for(int j=i;j<n;j++){
//                if(arr[j]<min){
//                    min  = arr[j];
//                    mindx = j;
//                }
//            }
//            // array mindex and first array element
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//        System.out.println();
//        print(arr);
        System.out.println();
        // selection sort in decreasing order
//        for(int i=n-1;i>1;i--){
//            int max  = Integer.MAX_VALUE;
//            int maxdx = -1;
//            for(int j=i;j>0;j--){
//                if(arr[j]<max){
//                    max = arr[j];
//                    maxdx = j;
//                }
//            }
//            int temp=arr[i];
//            arr[i] = arr[maxdx];
//            arr[maxdx] = temp;
//        }
//        print(arr);
        System.out.println();
        for(int i=n-1;i>1;i--){
            int max  = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j=i;j>=0;j--){
                if(arr[j]>max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp=arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        print(arr);
    }
}

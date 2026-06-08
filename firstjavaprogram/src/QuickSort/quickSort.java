package QuickSort;

public class quickSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public  static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr , int lo , int hi){
        int mid = (lo+hi)/2;
        int pivot = arr[mid] ,pivotIdx = mid;
        int smallerCount = 0;
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr , pivotIdx , correctIdx);
        // partition
        int i = lo , j = hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j] > pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr , i ,j);
            }
        }
        return correctIdx;
    }
    public static void quick_sort(int[] arr, int lo , int  hi){
        if(lo>=hi) return;
        // pivot (arr[lo]) ko sahi jagah rakhega
        int idx = partition(arr , lo ,hi);
        quick_sort(arr , lo , idx-1);
        quick_sort(arr , idx+1 , hi);
    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,2,3,6,5,8};
        print(arr);
        int n = arr.length;
        quick_sort(arr,0,n-1);
        print(arr);
    }
}

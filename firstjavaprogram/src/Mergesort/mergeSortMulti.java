package Mergesort;

public class mergeSortMulti {
    public static void merge(int[] arr,int lb,int mid,int ub){
        int i=lb,j=mid+1,k=lb;
        int[] brr =new int[arr.length];
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
                brr[k++]=arr[i++];
            }
            else{
                brr[k++]=arr[j++];
            }
        }
        if(i>mid){
            while(j<=ub){
                brr[k++]=arr[j++];
            }
        }
        else{
            while(i<=mid){
                brr[k++]=arr[i++];
            }
        }
        for(k=lb;k<=ub;k++){
            arr[k]=brr[k];
        }
    }
    public static void merge_sort(int[] arr ,int lb , int ub){
        if(lb<ub){
            int mid = (ub+lb)/2;
            merge_sort(arr,lb,mid);
            merge_sort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,8,9,6,7,5,12,32,59,10};
        System.out.println("Unsorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        merge_sort(arr,0,arr.length-1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

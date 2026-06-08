package binarysearch;

public class lowerbound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int x = 40;
        int lo =0, hi = n-1;
        int lb=n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=x) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        System.out.println(lo);
    }
}

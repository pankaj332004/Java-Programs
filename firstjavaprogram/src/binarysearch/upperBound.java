package binarysearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70,80,90};
        int n = arr.length;
        int x = 90;
        int lo  = 0, hi = n-1;
        int up = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>x){
                hi = mid -1;
                up = Math.min(up,mid);
            }
            else{
                lo = mid + 1;
            }
        }
        System.out.println(up);
    }
}

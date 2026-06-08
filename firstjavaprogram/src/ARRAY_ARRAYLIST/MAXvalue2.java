package ARRAY_ARRAYLIST;

public class MAXvalue2 {
    public static void main(String[] args) {
        int[] arr={-10, -8, -9, -20, 12, -56};
        int n=arr.length;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            // if(arr[i]>max) max=arr[i];
            max =Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}

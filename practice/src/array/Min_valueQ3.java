package array;

public class Min_valueQ3 {
    public static void main(String[] args) {
        int[] arr={10,12,23,25,24,8,9,7,5};
        int n= arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}

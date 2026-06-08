package array;

public class strictly {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,7,9,};
        int n=arr.length;
        int count=0;
        int x= 5;
        for(int i=0;i<n;i++){
            if(arr[i]>x) count++;
        }
        System.out.println(count);
    }
}

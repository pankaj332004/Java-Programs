package array;

public class evenindexoddindexQ9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        int evenindex=0;
        int oddindex=0;
        for(int i=0;i<n;i++){
            if(i%2==0) evenindex = evenindex+arr[i];
            else oddindex=oddindex+arr[i];
        }
        System.out.println("Even index sum "+evenindex+"\nOdd index sum "+oddindex);
    }
}

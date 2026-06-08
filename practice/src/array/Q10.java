package array;

public class Q10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        int[] crr=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                crr[i]=arr[i]+10;
            }
            else{
                crr[i]=arr[i]*2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(crr[i]+" ");
        }
    }
}

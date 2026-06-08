package Problem;

public class move0toend {
    public static void movesZeroEnd(int[] arr){
        int j=0,i=0;
        int n= arr.length;
        while(i<n){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,0,2,0,1};
        movesZeroEnd(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}

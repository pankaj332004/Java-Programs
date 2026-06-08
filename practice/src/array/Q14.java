package array;

public class Q14 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,10};
        int m=arr.length;
        int[] brr={7,9,11,15,16,17,18};
        int n= brr.length;
        int[] crr=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr[i]<brr[j]){
                crr[k] = arr[i];
                i++; k++;
            }
            else if(arr[i]>brr[j]){
                crr[k]=brr[j];
                j++; k++;
            }
            else{
                crr[k]=arr[i];
                i++; j++; k++;
            }
        }
        while(j<n){
            crr[k]=brr[j];
            j++; k++;
        }
        while(i<m){
            crr[k]=arr[i];
            i++; k++;
        }
        for(int ele: crr){
            System.out.print(ele+" ");
        }
    }
}

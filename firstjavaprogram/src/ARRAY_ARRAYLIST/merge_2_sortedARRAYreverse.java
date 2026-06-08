package ARRAY_ARRAYLIST;

public class merge_2_sortedARRAYreverse {
    public static void main(String[] args) {
        int[] arr={11,33,42,62};
        int[] brr={26,54,69,81,94};
        int n=arr.length;
        int m=brr.length;
        int[] crr=new int[n+m];
        int i=n-1,j=m-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(arr[i]>brr[j]){
                crr[k]=arr[i];
                i--; k--;
            }
            else if(arr[i]<brr[j]){
                crr[k]=brr[j];
                j--;k--;
            }
            else{
                crr[k]=arr[i];
                i--;k--;j--;
            }
        }
        //if(i==0){// now take elements from brr only
            while (j>=0){
                crr[k] = brr[j];
                j--;k--;
            }
        //}
        //else{// now take elements from arr only
            while (i>=0){
                crr[k] = arr[i];
                i--;k--;
            }
        //}
        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}

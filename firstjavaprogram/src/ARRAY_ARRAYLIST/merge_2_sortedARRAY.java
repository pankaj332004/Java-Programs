package ARRAY_ARRAYLIST;

public class merge_2_sortedARRAY {
    public static void main(String[] args) {
        int[] arr={11,33,42,62};
        int[] brr={26,54,69,81,94};
        int n=arr.length;
        int m=brr.length;
        int[] crr=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++; k++;
            }
            else if(arr[i]>brr[j]){
                crr[k]=brr[j];
                j++;k++;
            }
            else{
                crr[k]=arr[i];
                i++;k++;j++;
            }
        }
        if(i==n){// now take elements from brr only
            while (j<m){
                crr[k] = brr[j];
                j++;k++;
            }
        }
        else{// now take elements from arr only
            while (i<n){
                crr[k] = arr[i];
                i++;k++;
            }
        }
        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}

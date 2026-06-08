package array;

public class laregestTHREE {
    public static void main(String[] args) {
        int[] arr = {12,25,36,24,25,85,96,75,99,};
        int n= arr.length;
        int fmx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            fmx=Math.max(fmx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=fmx){
                smx=Math.max(smx,arr[i]);
            }
        }
        int tmx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=fmx && arr[i]!=smx){
                tmx=Math.max(tmx,arr[i]);
            }
        }
        System.out.println("first maximum "+fmx);
        System.out.println("second maximum "+smx);
        System.out.println("third maximum "+tmx);
    }
}

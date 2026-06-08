package array;

public class duplicateQ4 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,6,6,6,7,7,8,8,};
        int n=arr.length;
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=brr[i];
                }
            }
        }
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}

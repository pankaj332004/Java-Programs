package array;

public class productQ1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int pro=1;
        for(int i=0;i<n;i++){
            pro=arr[i]*pro;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.print("\n product "+pro);
    }
}

package ARRAY_ARRAYLIST;

public class next_greatest_element {
    public static void main(String[] args) {
        int[] arr={12,8,60,37,2,49,16,28,21};
        // means number ke aage sabse bada element kon sa hai
        int n= arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1;
        // method 1 : brute force
        /*for(int i=0;i<n-1;i++){
            int mx=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                mx = Math.max(mx,arr[j]);
            }
            ans[i] = mx;
        }*/

        // method 2 : optimise
        int nge = arr[n-1];
        for(int i =n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}

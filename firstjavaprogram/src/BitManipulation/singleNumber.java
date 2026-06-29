package BitManipulation;

public class singleNumber {
    public static int single(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,5,6,6};
        int ans = single(arr);
        System.out.println(ans);
    }
}

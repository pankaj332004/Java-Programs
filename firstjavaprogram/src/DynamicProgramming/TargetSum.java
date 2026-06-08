package DynamicProgramming;

public class TargetSum {
    public static int ways(int i, int[] arr , int target){
        if(i==arr.length){
            if(target==0) return 1;
            else return 0;
        }
        int add = ways(i+1 , arr , target-arr[i]);
        int sub = ways(i+1 , arr , target+arr[i]);
        return add+sub;
    }
    public static int targetSum(int[] arr , int target){
        return ways(0,arr,target);
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1};
        int target = 3;
        int ans = targetSum(arr ,target);
        System.out.println(ans);
    }
}

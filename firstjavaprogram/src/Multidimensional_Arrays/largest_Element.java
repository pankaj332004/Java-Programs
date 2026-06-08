package Multidimensional_Arrays;

public class largest_Element {
    public static void main(String[] args) {
        int[][] arr = {{6,9,3},{4,2,8},{4,8,12}};
        int n= arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] > max){
                    max=Math.max(arr[i][j] , max);
                }
            }
        }
        System.out.println(max);
    }
}

package Multidimensional_Arrays;

public class smallest_element {
    public static void main(String[] args) {
        int[][] arr = {{6,9,3},{4,2,8},{4,8,12}};
        int n= arr.length;
        int m=arr[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] < min){
                    min=Math.min(arr[i][j] , min);
                }
            }
        }
        System.out.println(min);
    }
}

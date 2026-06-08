package practical2;

public class Q1 {
    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,1,1},{1,1,1}};
        int arr1[][] = {{1,1,1},{1,1,1},{1,1,1}};
        int n= arr.length;
        int m=arr[0].length;
        int p = arr1.length;
        int q = arr1[0].length;
        int[][] mul = new int[m][q];
        if(m!=p) System.out.println("multiplication not possible");
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < q; j++) {
                    mul[i][j]=0;
                    for (int k = 0; k < m; k++) {
                        mul[i][j]=mul[i][j]+(arr[i][k]*arr1[k][j]);
                    }
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

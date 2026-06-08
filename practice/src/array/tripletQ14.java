package array;

public class tripletQ14 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 8, 5, 4, 9, 1, 2};
        int x = 9;
        int n = arr.length;
        // solution
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                for(int k=j+1;k<n;k++){
                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.println("number found at index " + i + " " + j + " " + k + "\nnumber is " + arr[i] + " " + arr[j] + " " + arr[k] );
                    }
                }
            }
        }
    }
}

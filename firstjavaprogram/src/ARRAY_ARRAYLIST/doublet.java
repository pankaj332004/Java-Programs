package ARRAY_ARRAYLIST;

public class doublet {
    public static void main(String[] args) {
        int[] arr = {3, 0, 8, 5, 4, 9, 2};
        int x = 9;
        int n = arr.length;
        // solution
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == x){
                    System.out.println("number found at index " +i+" "+j+"\nnumber is "+arr[i]+" "+arr[j]);
                }
//                else{
//                    System.out.println("Not found");
//                }
            }
        }
    }
}

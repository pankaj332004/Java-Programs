package practical3;

import java.util.Scanner;

public class shape {
    public static int[] incDEC(int[] arr , int k){
        int[] answer = new int[100];
        for(int i=0;i<k-1;i++){
           for(int j=i+1;j<k;j++){
               if(arr[j]<arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        for(int i=k;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int[] result = incDEC(arr , k);
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
    }
}

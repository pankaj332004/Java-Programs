package Array;

public class array_example {
   static void display(int arr2[]){
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i=0;i<3;i++){
            arr[i]=i+1;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[] = {5,6,7};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        display(arr2);
    }
}

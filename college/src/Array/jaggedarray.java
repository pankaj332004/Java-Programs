package Array;

public class jaggedarray {
    public static void main(String[] args) {
        int arr3[][]={{1,2,3},{4,5},{6,7,8,9}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int arr4[][] = new int[3][];
        arr4[0]=new int[4];
        arr4[1]=new int[2];
        arr4[2]=new int[3];
        int count = 7;
        for (int i = 0; i <arr4.length ; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j]=count++;
            }
        }
        for (int i = 0; i <arr4.length ; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    }
}

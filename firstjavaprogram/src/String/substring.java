package String;

public class substring {
    public static void main(String[] args) {
//        String s = "abcde";
//        System.out.println(s.substring(1));
//        System.out.println(s.substring(1,4));
//        System.out.println("abc"+10+20);
//        System.out.println(10+20+

//        String str = "Physics";
//        for(int j=2;j<4;j++){
//            System.out.print(str.substring(j)+" ");
//        }

        String str = "abcd";
//        for(int i=0;i< str.length();i++){
//            for(int j=i+1;j<=str.length();j++) {
//                System.out.print(str.substring(i, j)+" ");
//            }
//            System.out.println();
//        }
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
//        String str ="";
//        int n=9;
//        for(int i=0;i<=n;i++){
//            str+=i;
//        }
//        System.out.println(str);
    }
}

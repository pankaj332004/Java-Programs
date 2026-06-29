package BitManipulation;

public class xorOfNumberInGivenRange {
    public static int xorOfRange(int[] arr){
        int xorL =0 ;
        int xorR=0;
        for(int i=0;i<arr[0]-1;i++){
            xorL ^= (i+1);
        }
        for(int i=0;i<arr[1];i++){
            xorR ^= (i+1);
        }
        return xorL^xorR;
    }
//    public static int xorOfRange(int[] arr){
//        int xor =0 ;
//        for(int i=arr[0];i<=arr[1];i++){
//            xor ^= i;
//        }
//
//        return xor;
//    }
    public static int XOR(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return n;
    }
    public static int findXOR(int l, int r) {
        // code here
        int xorL = XOR(l-1);
        int xorR = XOR(r);
        return xorL^xorR;
    }
    public static void main(String[] args) {
        int[] arr = {4,8};
        int ans = xorOfRange(arr);
        int res =  findXOR(arr[0],arr[1]);
        System.out.println(res);
        System.out.println(ans);
    }
}

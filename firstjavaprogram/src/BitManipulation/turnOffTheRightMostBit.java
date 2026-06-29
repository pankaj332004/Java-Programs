package BitManipulation;

public class turnOffTheRightMostBit {
    public static void main(String[] args) {
        int n = 1480;
        // brute force approach
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                n = n & ~(1 << i);
                break;
            }
        }
        // standard one
//        n = n&(n-1);
        System.out.println(n);
    }
}

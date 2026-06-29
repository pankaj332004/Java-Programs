package BitManipulation;

public class kthBitSet {
    public static void main(String[] args) {
        int a = 1483;
        int k = 3;
        int mask = (1<<k);
        if((a&mask)==0) System.out.println(false);
        if((a&mask)!=0) System.out.println(true);
    }
}

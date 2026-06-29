package BitManipulation;

public class turnOffKthBit {
    public static void main(String[] args) {
        int  a = 1483;
        int k=7;
        int mask = 1<<k;
        a=a&~mask;
        System.out.println(a);
    }
}

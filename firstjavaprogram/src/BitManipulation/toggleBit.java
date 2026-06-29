package BitManipulation;

public class toggleBit {
    public static void main(String[] args) {
        int a = 1483;
        int k = 5;
        int mask = 1<<k;
        a = a^mask;
        System.out.println(a);
    }
}

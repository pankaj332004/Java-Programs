package stringbuilder;

public class StringBuilderinjava {
    public static void main(String[] args) {
        //String s = new String("Pankaj");
        StringBuilder sb = new StringBuilder("Pankaj");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder x = new StringBuilder(10);
        System.out.println(x.capacity());
    }
}

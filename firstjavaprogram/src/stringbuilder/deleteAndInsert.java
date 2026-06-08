package stringbuilder;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCDEF");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(2,"xyz");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

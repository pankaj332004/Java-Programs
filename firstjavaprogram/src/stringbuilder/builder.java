package stringbuilder;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        System.out.println(str.deleteCharAt(0));
        System.out.println(str.reverse());
        System.out.println(str.delete(0,3));
        System.out.println(str.append("Pankaj"));
        System.out.println(str.delete(0,4));
    }
}

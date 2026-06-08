package String;

public class indexOf {
    public static void main(String[] args) {
        String s = "Pankaj babu";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('j'));
        System.out.println(s.indexOf('z'));

        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b));

        String c = "Physics Wallah Skills";
        System.out.println(c.contains(" Wallah "));
        System.out.println(c.startsWith("Physics "));
        System.out.println(c.endsWith("lls"));
    }
}

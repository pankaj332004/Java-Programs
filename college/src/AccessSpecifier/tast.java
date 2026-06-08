package AccessSpecifier;

public class tast {
    int a = 7;
}
class test extends  tast{
    public static void main(String[] args) {

        tast t = new tast();
        System.out.println(t.a);
    }
}

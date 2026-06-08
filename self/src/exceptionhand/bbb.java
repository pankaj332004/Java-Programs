package exceptionhand;

public class bbb {
    public static void main(String[] args) {
        try{
            int a = 100;
            int b = 0;
            int c;
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            // 1 method exceptionName , description , stack trace(line of exception )
            //e.printStackTrace();

            // 2 method exceptionName , description
            //System.out.println(e);
            //System.out.println(e.toString());

            // 3 method only description
            // System.out.println(e.getMessage());
        }
    }
}

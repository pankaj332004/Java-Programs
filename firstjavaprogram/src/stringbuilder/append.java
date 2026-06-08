package stringbuilder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PANKAJ ");
        System.out.println(sb);
        sb.append("KUMAR ");
        System.out.println(sb);
        sb.append(22);
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        char[] ch = {'R','a','j','b','h','a','r'};
        sb.append(ch);
        System.out.println(sb);
//        int[] arr={1,2,3,4,5,6};
//        sb.append(arr);//  does not work
//        System.out.println(sb);
        StringBuilder t = new StringBuilder("TWITTER");
        sb.append(t);
        System.out.println(sb);
    }
}

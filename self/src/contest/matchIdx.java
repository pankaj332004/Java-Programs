package contest;

public class matchIdx {
    public static int firstMatchingIndex(String s) {
        int idx = -1;
        int n = s.length();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(ch[left]==ch[right]){
                idx=left;
                break;
            }
            left++;
            right--;
        }
        return idx;
    }
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(firstMatchingIndex(s));
    }
}

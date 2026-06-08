package LinkedList;

import java.util.Scanner;

public class nodesBtwCriticalPointLEET {
    public static int[] minDistMaxDist(Node head){
        Node left = head;
        Node mid = head.next;
        Node right = head.next.next;
        int first = -1, last = -1;
        int[] arr = {-1,-1};
        int idx=1;
        int minDist = Integer.MAX_VALUE;
        while(right!=null){
            if(left.val<mid.val && right.val< mid.val  || left.val>mid.val && right.val>mid.val){
                if(first==-1)first=idx;
                else{
                    minDist=Math.min(minDist,idx-last);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if(first==last) return  arr;
        int maxDist = last-first;
        arr[0]=minDist;
        arr[1]=maxDist;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int[] ans = minDistMaxDist(head);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

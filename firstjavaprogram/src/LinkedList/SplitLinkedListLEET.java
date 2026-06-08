package LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class SplitLinkedListLEET {
    public static int lengthOfList(Node head){
        int len=0;
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public static Node[] splitLinkedlist(Node head,int k){
        int n=lengthOfList(head);
        int size=n/k;
        int extra=n%k;

        Node[] arr = new Node[k];
        Node temp = head;

        for(int i=0;i<k;i++){
            int part = size+(extra>0?1:0);
            if(extra>0) extra--;

            if(temp==null){
                arr[i]=null;
            }

            arr[i]=temp;

            for(int j=1;j<part;j++){
                temp=temp.next;
            }

            Node a = temp.next;
            temp.next = null;
            temp = a;
        }
        return arr;
    }
    public static String listToString(Node head) {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.val);
            if (temp.next != null) sb.append("->");
            temp = temp.next;
        }
        return sb.toString();
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

        Node[] parts = splitLinkedlist(head,3);
        for(Node part:parts){
            System.out.println(listToString(part));
        }
    }
}

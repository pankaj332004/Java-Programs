package STACK;

import java.util.Stack;

public class reverseAStack {
    public static void main(String[] args) {
        Stack<Integer> Ori = new Stack<>();
        Stack<Integer> Rev = new Stack<>();
        Ori.push(1);
        Ori.push(2);
        Ori.push(3);
        Ori.push(4);
        Ori.push(5);
        Ori.push(6);
        System.out.println(Ori);
//        Rev.push(Ori.pop());
//        Rev.push(Ori.pop());
//        Rev.push(Ori.pop());
//        Rev.push(Ori.pop());
//        Rev.push(Ori.pop());
//        Rev.push(Ori.pop());
        while(!Ori.isEmpty()){
            Rev.push(Ori.pop());
        }
        System.out.println(Rev);
    }
}

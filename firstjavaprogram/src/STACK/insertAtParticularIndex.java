package STACK;

import java.util.Stack;

public class insertAtParticularIndex {
    public static void main(String[] args) {
        Stack<Integer> stOriginal = new Stack<>();
        stOriginal.push(10);
        stOriginal.push(20);
        stOriginal.push(30);
        stOriginal.push(40);
        stOriginal.push(50);
        System.out.println(stOriginal);
        int idx = 2;
        Stack<Integer> stTemp = new Stack<>();
        while (stOriginal.size()-1>=idx){
            stTemp.push(stOriginal.pop());
        }
        stTemp.push(80);
        while (stTemp.size()>0){
            stOriginal.push(stTemp.pop());
        }
        System.out.println(stOriginal);
    }
}

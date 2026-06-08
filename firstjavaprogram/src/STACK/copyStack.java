package STACK;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> stOriginal = new Stack<>();
        stOriginal.push(10);
        stOriginal.push(20);
        stOriginal.push(30);
        stOriginal.push(40);
        stOriginal.push(50);
        stOriginal.push(60);
        stOriginal.push(70);
        System.out.println(stOriginal);
        Stack<Integer> stTemp = new Stack<>();
        while(!stOriginal.isEmpty()){
            stTemp.push(stOriginal.pop());
        }
        System.out.println(stTemp);
        System.out.println(stOriginal);
        // pushing element at the bottom of the index
        stOriginal.push(80);
        while(!stTemp.isEmpty()){
            stOriginal.push(stTemp.pop());
        }
        System.out.println(stOriginal);
    }
}

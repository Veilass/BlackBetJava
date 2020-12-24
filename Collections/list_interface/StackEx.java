package Collections.list_interface;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Masha");
        System.out.println(stack);
//        while  (!stack.isEmpty()) {
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println( stack);
    }
}

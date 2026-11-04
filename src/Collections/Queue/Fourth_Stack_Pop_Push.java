package Collections.Queue;

import java.util.*;
public class Fourth_Stack_Pop_Push {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}

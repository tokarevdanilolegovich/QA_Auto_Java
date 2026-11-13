package Collections_HomeWork.ArrayDeque;

import java.util.*;

public class ArrayDeque2 {
    public static void main(String[] args){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("One");
        deque.push("Two");
        deque.push("Three");
        deque.push("Four");
        deque.push("Five");
        while(!(deque.isEmpty())){
            System.out.println(deque.pop());
        }
    }
}

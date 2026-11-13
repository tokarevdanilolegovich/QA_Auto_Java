package Collections_HomeWork.ArrayDeque;

import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args){
        Queue<String> deque = new ArrayDeque<>();
        deque.add("String1");
        deque.add("String2");
        deque.add("String3");
        deque.add("String4");
        deque.add("String5");
        System.out.println(deque);
        for(String element : deque){
            System.out.println(element);
        }
    }
}

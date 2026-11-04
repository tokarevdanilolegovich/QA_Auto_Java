package Collections.Queue;
import java.util.*;
public class Third {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("B");//[B]
        deque.addLast("C");//[B, C]
        deque.addFirst("A");// [A, B, C]

        System.out.println(deque.removeFirst()); //A, [B,C]
        System.out.println(deque.removeLast());//C, [B]
        System.out.println(deque);// [B]
    }
}

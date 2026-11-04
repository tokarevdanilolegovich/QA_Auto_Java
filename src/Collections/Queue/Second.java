package Collections.Queue;
import java.util.*;

public class Second {
    public static void main(String[] args){
        Queue<String> queue = new ArrayDeque<>();

        System.out.println(queue.poll()); //null
        System.out.println(queue.peek()); //null
        System.out.println(queue.isEmpty()); //true

    }
}

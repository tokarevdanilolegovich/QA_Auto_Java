package practice_7_Collections.LinkedHashSet_HashMap_TreeMap;
import java.util.*;
public class PriorityQueue_poll {
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);

        queue.add(3);
        System.out.println(queue);

        System.out.println(queue.poll()); // в priority queue приоритет идёт от меньшего к большему
        //poll удаляет и возвращает ГОЛОВУ(1ый элемент) из очереди
        System.out.println(queue);

        //
    }
}

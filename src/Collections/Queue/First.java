package Collections.Queue;
import java.util.*;
public class First {
    public static void main(String[] args){
        Queue<String> queue = new ArrayDeque<>();
        //Queue - интерфейс / тип данных
        //ArrayDeque - класс имплементирующий  интерфейс Deque
        //ArrayDeque<>() - конструктор класса ArrayDeque

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");


        System.out.println(queue);
        System.out.println(queue.poll()); //взять и удалить вершину очереди
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());//взять, но не удалять
        System.out.println(queue);
    }
}

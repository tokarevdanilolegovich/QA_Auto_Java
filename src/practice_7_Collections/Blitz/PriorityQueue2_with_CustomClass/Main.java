package practice_7_Collections.Blitz.PriorityQueue2_with_CustomClass;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        PriorityQueue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("A"));
        queue.add(new Person("B"));

        System.out.println(queue.poll().name);
        System.out.println(queue.poll().name);
    }
}

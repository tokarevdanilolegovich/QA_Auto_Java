package practice_7_Collections.Blitz.PriorityQueue_withCustomClass;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        PriorityQueue<Person> queue = new PriorityQueue<>(); //PriorityQueue работает через compareTo()
        queue.add(new Person("A"));
        queue.add(new Person("B"));
        System.out.println(queue.poll().name);
    }
}
//Должен реализовывать интерфейс Comparable
package Collections.Queue;
import java.util.*;

public class Fifth_PriorityQueue {
    public static void main(String[] args){
        Queue<Integer>  priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(10);

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}

package Collections_HomeWork.PriorityQueue;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args){
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(50);
        numbers.add(150);
        numbers.add(1);
        numbers.add(690);
        numbers.add(7777);
        while(!(numbers.isEmpty())){
            System.out.println(numbers.poll());
        }
    }
}

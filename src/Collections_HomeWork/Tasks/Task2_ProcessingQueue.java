package Collections_HomeWork.Tasks;

import java.util.*;

public class Task2_ProcessingQueue {
    public static void main(String[] args){
        LinkedList<String> tasks = new LinkedList<>();
        for(int i = 1; i < 11 ; i++){
            tasks.add("Задача" + " " +  i);
        }


        while(!(tasks.isEmpty())){
            System.out.println(tasks.poll());
        }
    }
}

package Collections_HomeWork.LinkedList;

import java.util.*;

public class LinkedList2 {
    public static void main(String[] args){
        Queue<String> tasks = new LinkedList<>();
        tasks.add("First task");
        tasks.add("Second task");
        tasks.add("Third task");

        while(!(tasks.isEmpty())){
            System.out.println(tasks.poll() + " was processed");
        }
    }
}

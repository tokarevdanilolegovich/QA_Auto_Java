package Collections.List;
import java.util.*;
public class Fifth {
    public static void main(String[] args){
        List<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add(0, "Urgent");

        System.out.println(tasks);
        System.out.println(tasks.get(1));
    }
}

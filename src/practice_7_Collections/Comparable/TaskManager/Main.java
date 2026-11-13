package practice_7_Collections.Comparable.TaskManager;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args){
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        Task cleanFloor = new Task("Помыть пол", Date.from(yesterday.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Task washDishes = new Task("Помыть посуду", Date.from(tomorrow.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(cleanFloor);
        taskManager.addTask(washDishes);
        System.out.println(taskManager.sortByDeadline());

        taskManager.removeTaskByName("Помыть пол");
        taskManager.removeTaskByName("Забрать из детсада");
    }
}

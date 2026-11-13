package practice_7_Collections.Comparable.TaskManager;

import java.util.LinkedList;
import java.util.*;

/**
 * Список дел
 * Требуется сохранить список задач,которые можно пополнять,удалять,сортировать по сроку выполнения
 *
 * Алгоритм решения
 * 1)Выбор структуры данных
 * линейная - список или массив?
 * какие популярные операции?
 * если доступ к элементу и редко имзенения размера(вставка,удаление) -> МАССИВ
 *
 * если редко доступ к элементу и часто изменение размера(вставка,удаление) -> СПИСОК
 *
 *
 * решение: список
 *
 * 2)Проектирование элементов структуры данных
 * Задача:
 * - срок выполнения: int, Date
 * - название: String
 *
 * 3)Как реализовать сортировку
 */
public class TaskManager {
    private LinkedList<Task> tasks;

    public TaskManager(){
        this.tasks = new LinkedList<>();
    }
    public void addTask(Task task){
        this.tasks.add(task);
        System.out.println("LOG: Задача " + task.getName() + " добавлена.");
    }

    public void removeTaskByName(String name){
        //Шаг 1 - найти задачу
        Task foundTask = null;
        for (Task task : tasks){
            if(task.getName().equals(name)){
               foundTask = task;
            }
        }
        //обработка ситуации когда задача не найдена по имени
        if(foundTask == null){
            System.out.println("ERROR: Задача с именем " + name+ " не была найдена.");
            return;
        }
        //Шаг 2 - удалить задачу
        this.tasks.remove(foundTask);
        System.out.println("LOG: Задача " + name + " была удалена. ");
    }
    public LinkedList<Task> sortByDeadline(){
        //Вариант #1: написать сортировку (пузырьком). Минус: создаём велосипед с нуля
        //Вариант #2: переиспользовать существующую сортировку Collection.sort();
        //Сортировка для примитивных типов данных: работа по умолчанию
        //Java уже знает,кто больше/меньше из примитивных типов данных (пример: int 8 > int 4)
        //Java  НЕ знает,кто больше для класса Task (ссылочный тип данных)
        //Нужно объяснить Java как сравнивать Task
        LinkedList<Task> sortedTasks = new LinkedList<>(tasks);
        Collections.sort(sortedTasks);
        System.out.println("Log: список задач отсортирован по дедлайну");
        return sortedTasks;
    }
}

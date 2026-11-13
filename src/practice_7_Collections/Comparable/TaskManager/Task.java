package practice_7_Collections.Comparable.TaskManager;

import java.util.Date;

public class Task implements Comparable<Task> {
    private String name;
    private Date date;

    public Task(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }
    public Date getDate(){
        return this.date;
    }

    @Override
    public String toString(){
        return "Task{" +
                "name='" + name + '\'' +
                ", date= " + date +
                '}';
    }

    /**
     * Задача:
     * 1.возвращаем негативное число,если задача task более приоритетная, то есть deadline раньше,чем у текущей задачи this
     * 2.возвращаем 0,если задача task такого же приоритеа, то есть deadline равны с  this
     * 3.возвращаем позитивное число,если задача task менее приоритетная, то есть deadline позже,чем у текущей задачи this
     *
     * @param task the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Task task){
        return this.date.compareTo(task.date);
    }

}

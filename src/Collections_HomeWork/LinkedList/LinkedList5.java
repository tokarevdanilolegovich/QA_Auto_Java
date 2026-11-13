package Collections_HomeWork.LinkedList;

import java.util.*;

public class LinkedList5 {
    public static void main(String[] args){
        List<String> numbers = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            numbers.add("A" + i);
            //System.out.println(numbers);
        }
        ListIterator<String> it = numbers.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("Обход вперед завершен");
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println("Обход назад завершен");
        System.out.println();
    }
}

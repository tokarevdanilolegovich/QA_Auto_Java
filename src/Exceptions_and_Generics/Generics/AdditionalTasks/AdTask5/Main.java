package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask5;

import java.util.*;

public class Main {
    // ? super Integer — «список какого-то СУПЕРТИПА Integer» (Number, Object, сам Integer).
    // Границу super можно писать ТОЛЬКО у wildcard: <T super Integer> в Java запрещено.
    // Правило PECS: метод ЗАПИСЫВАЕТ (consumes) Integer-ы → нужен super
    public static  void addNumbers(List<? super Integer> list){
        // добавить Integer безопасно: он влезает в любой свой супертип —
        // компилятор разрешает, даже не зная, что за список придёт на самом деле
        list.add(1);
        list.add(2);
        list.add(3);

    }
    public static void main(String[] args){
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        addNumbers(numbers);
        addNumbers(objects);
        addNumbers(integers);

        // чтение: компилятор гарантирует лишь Object (не знает точный тип списка),
        // поэтому без приведения типа использовать элемент как Integer нельзя
        Integer asInteger = (Integer) numbers.get(0);
        System.out.println("После приведения типов: " + asInteger);
    }
}

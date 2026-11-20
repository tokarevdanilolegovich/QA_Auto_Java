package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask4;

import java.util.*;

public class Main {
    // ВНИМАНИЕ: граница <T extends Number> пишется ПЕРЕД возвращаемым типом —
    // это МЕСТО ОБЪЯВЛЕНИЯ T. Внутри List<...> в параметре её писать нельзя:
    // там можно только ИСПОЛЬЗОВАТЬ уже объявленный T (подсказка ДЗ была ошибочна)
    public static <T extends Number> void sum(List<T> list){
        double sum = 0;
        for(T e : list){
            // e.doubleValue() легален только благодаря extends Number (см. NumberBox)
            sum = sum + e.doubleValue();
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,55,6667,1000));
        List<Double> doubles = new LinkedList<>(List.of(1.56,4.55,8.88,9999.567));

        sum(integers);
        sum(doubles);
    }
}

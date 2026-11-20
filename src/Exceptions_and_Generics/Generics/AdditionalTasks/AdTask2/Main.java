package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask2;

import java.util.*;

public class Main {
    public static <T> void printList(List<T> list){
        for(T e : list){
            System.out.println(e);
        }
        System.out.println();
    }
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,66,77,123,444));
        List<String> strings = new LinkedList<>(List.of("str1","str2","STRING3"));

        printList(integers);
        printList(strings);
    }
}

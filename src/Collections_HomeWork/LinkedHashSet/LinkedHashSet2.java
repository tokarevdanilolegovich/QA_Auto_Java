package Collections_HomeWork.LinkedHashSet;

import java.util.*;

public class LinkedHashSet2 {
    public static void addOnlyUniqueElement(LinkedHashSet<String> set,String element){
        if(!set.contains(element)){
            set.add(element);
        }

    }
    public static void main(String[] args){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        System.out.println("Проверка до: " + set);
        addOnlyUniqueElement(set,"Three");
        System.out.println("Проверка после 3: " + set);
        addOnlyUniqueElement(set,"One");
        System.out.println("Проверка после 1: " + set);



    }
}

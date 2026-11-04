package Collections.Set;
import java.util.*;
public class First_HashSet {
    public static void main(String[] args){
        Set<String> names = new HashSet<>(); //Set - интерфейс, <String> - тип данных что мы храним(строку), HashSet<>() - конструктор конкретной имплементации Set'a, а именно HashSet

        System.out.println(names.add("Alex"));
        System.out.println(names.add("Anna"));
        System.out.println(names.add("Alex"));

        System.out.println(names.size());
    }
}


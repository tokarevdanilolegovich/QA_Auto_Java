package practice_7_Collections.LinkedHashSet_HashMap_TreeMap.Person_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        Set<Person> set = new TreeSet<>(Comparator.comparing(p -> p.name));
        set.add(new Person("Alice"));
        set.add(new Person("Bob"));
        set.add(new Person("Alice"));

        System.out.println(set.size());
    }
}

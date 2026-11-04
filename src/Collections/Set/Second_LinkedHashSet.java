package Collections.Set;
import java.util.*;
public class Second_LinkedHashSet {
    public static void main(String[] args){
        Set<String> names = new LinkedHashSet<>();

        names.add("Bob");
        names.add("Alex");
        names.add("Anna");
        names.add("Alex");

        for (String name : names){
            System.out.println(name);
        }
    }
}

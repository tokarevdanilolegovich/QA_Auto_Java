package Collections.Map;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args){
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Alex", 30);
        ages.put("Anna", 25);

        System.out.println(ages.get("Alex"));
        System.out.println(ages.containsKey("Bob"));
        System.out.println(ages.containsValue(25));
        System.out.println(ages.size());
    }
}

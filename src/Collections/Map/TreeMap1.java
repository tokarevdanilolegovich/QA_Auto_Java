package Collections.Map;
import java.util.*;
public class TreeMap1 {
    public static void main(String[] args){
        Map<Integer, String> users = new TreeMap<>();

        users.put(1003, "Bob");
        users.put(1001, "Alice");
        users.put(1002, "Charlie");
        users.put(1001, "Alexandra");

        for (Map.Entry<Integer, String> entry : users.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

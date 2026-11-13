package Collections.Map;
import java.util.*;
public class HashMap3 {
    public static void main(String[] args){
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Alex");
        users.put(2, "Anna");

        users.remove(1);

        System.out.println(users.containsKey(1));
        System.out.println(users.size());

        users.clear();

        System.out.println(users.isEmpty());
    }
}

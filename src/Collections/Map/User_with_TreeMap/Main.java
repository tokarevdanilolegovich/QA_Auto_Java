package Collections.Map.User_with_TreeMap;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Map<User, String> users = new TreeMap<>();

        users.put(new User("Bob", 40), "Developer");
        users.put(new User("Alex", 30), "QA");
        users.put(new User("Anna", 25), "Manager");
        users.put(new User("Alex", 30), "Senior QA");

        for(Map.Entry<User, String> entry : users.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
        System.out.println(users.size());
    }
}

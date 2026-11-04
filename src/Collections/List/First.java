package Collections.List;

import java.util.*;

public class First {
    public static void main(String[] args){
        List<String> users = new ArrayList<>();

        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println(users.get(1));
        System.out.println(users.size());
        System.out.println(users.contains("Alice"));

    }
}

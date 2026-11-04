package Collections.List;
import java.util.*;

public class Second {
    public static void main(String[] args){
        List<String> users = new ArrayList<>();

        users.add("Alice");
        users.add("Anna");
        users.add("Bob");

        System.out.println(users.size());

        users.remove("Anna");

        System.out.println(users.contains("Anna"));
        System.out.println(users.size());



        users.clear();
        System.out.println(users.isEmpty());



    }
}

package Collections.Set.User_with_TreeSet;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Set<User> users = new TreeSet<>();

        users.add(new User("Alex", 20));
        users.add(new User("Alex", 40));
        users.add(new User("Bob", 30));

        System.out.println(users);
    }
}

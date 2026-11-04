package Collections.Set.User2_with_TreeSet;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Set<User> users = new TreeSet<>();

        users.add(new User("Bob", 40));
        users.add(new User("Alex", 30));
        users.add(new User("Anna", 25));
        users.add(new User("Alex", 30));

        System.out.println(users);
    }
}

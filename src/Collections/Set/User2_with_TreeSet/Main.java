package Collections.Set.User2_with_TreeSet;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Set<User> users = new TreeSet<>();

        System.out.println(new User("Bob", 40).compareTo(new User("Anna", 25)));//почему здесь 1? Потому что это разница между unicode(B) - unicode(A) = 1
        System.out.println(new User("Anna", 25).compareTo(new User("Alex", 30)));// почему здесь 2? Потому что это разница между unicode(n) - unicode(l) = 2

        users.add(new User("Bob", 40));
        users.add(new User("Alex", 30));
        users.add(new User("Anna", 25));
        users.add(new User("Alex", 30));

        System.out.println(users); // сначала сравнивает лексикографически
    }
}

package Collections.Set.HashSet_with_CustomClass_User;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Set<User> users = new HashSet<>();
        User user1 = new User("Alex", 30);
        User user2 = new User("Alex", 30);

        users.add(user1);
        users.add(user2);

        System.out.println(users.size());
        System.out.println(users);
    }
}

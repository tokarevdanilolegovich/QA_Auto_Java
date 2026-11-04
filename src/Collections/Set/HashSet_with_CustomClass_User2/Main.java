package Collections.Set.HashSet_with_CustomClass_User2;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Set<User2> users = new HashSet<>();

        users.add(new User2("Alex", 30));
        users.add(new User2("Alex", 30));

        System.out.println(users.size());
    }
}

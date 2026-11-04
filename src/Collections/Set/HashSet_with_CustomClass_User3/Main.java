package Collections.Set.HashSet_with_CustomClass_User3;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Set<User3> users = new HashSet<>();

        users.add(new User3("Alex"));
        users.add(new User3("Anna"));

        System.out.println(users.size());
    }
}

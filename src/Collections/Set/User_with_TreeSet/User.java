package Collections.Set.User_with_TreeSet;
import java.util.*;
public class User implements Comparable<User>{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other){
        return name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}

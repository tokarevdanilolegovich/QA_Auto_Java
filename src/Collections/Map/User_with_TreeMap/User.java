package Collections.Map.User_with_TreeMap;
import java.util.*;
public class User implements Comparable<User> {
    private String name;
    private int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other){
        int result = name.compareTo(other.name); //сначала сравниваем имена

        if(result != 0){
            return result; //только если имена разные мы переходи к сравнению возрастов ниже
        }

        return Integer.compare(age,other.age); //сравнимвем возраст
    }

    @Override
    public String toString(){
        return name + " " + age;
    }

}

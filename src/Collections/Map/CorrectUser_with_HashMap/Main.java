package Collections.Map.CorrectUser_with_HashMap;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Map<User, String> map = new HashMap<>();

        map.put(new User("Alex", 30), "First"); //user.hashCode() = hash("Alex",30) = 7  ->
        // index = 7 % 4 -> 3 - кладём этот объект в бакет 3 со значением "First"
        map.put(new User("Alex", 30),"Second"); //по hashCode() попадаем в тот же самый бакет,значит вызывается
        //переопределенный в классе User метод equals():
        //user1.equals(user2) :
        //30 == 30 && Objects.equals("Alex", "Alex") -> true
        //значит значение для этого ключа заменится на новое

        System.out.println(map.size());
        System.out.println(map.get(new User("Alex", 30)));
    }
}

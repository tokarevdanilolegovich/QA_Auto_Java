package Collections.Map.IncorrectUser_with_HashMap;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Map<User, String> map = new HashMap<>();

        User user1 = new User("Alex", 30);
        User user2 = new User("Alex", 30);

        map.put(user1,"First"); //вызвается метод hashCode().
        // в классе User мы его не переопрделяли,значит будет вызываться метод у родительского класса всех классов Object
        //user1.hashCode() -> 12
        //index бакета = 12 % 4 = 0 -> значит кладём в 0-ой бакет
        map.put(user2,"Second"); //вызовется аналогично метод hashCode() из класса Object,
        // который вернёт уже другое значение,
        // потому что реализация hashCode() в Object'e даёт другую цифру для другого объекта в памяти(другая ссылка на другой объект)
        //user2.hashCode() -> 11
        //index бакета = 11 % 4 = 3 -> значит кладём в 3-ий бакет

        //equals() даже не вызывается!
        System.out.println(map.size());
        System.out.println(map.get(user1)); // метод get() возвращает ТОЛЬКО ЗНАЧЕНИЕ,без ключа
        System.out.println(map.get(user2));
    }
}

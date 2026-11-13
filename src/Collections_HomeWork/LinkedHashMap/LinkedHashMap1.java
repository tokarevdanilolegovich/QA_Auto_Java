package Collections_HomeWork.LinkedHashMap;

import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args){
        Map<String, Integer> users = new LinkedHashMap<>();
        users.put("Пользователь 1" , 1);
        users.put("Пользователь 2" , 2);
        users.put("Пользователь 3" , 3);
        users.put("Пользователь 4" , 4);
        users.put("Пользователь 5" , 5);
        System.out.println(users);
        for(Map.Entry<String, Integer> entry : users.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

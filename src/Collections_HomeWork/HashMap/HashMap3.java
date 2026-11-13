package Collections_HomeWork.HashMap;

import java.util.*;

public class HashMap3 {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Мария", 27);
        map.put("Игорь", 29);
        map.put("Аркадий", 35);
        map.put("Борис", 44);
        map.put("Сергей", 40);
        map.put("Илья", 15);
        map.put("Анастасия", 16);
        map.put("Семен", 14);

        printUnderage(map);
    }
    public static void printUnderage(Map<String, Integer> map){
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() < 18){
                System.out.println("Пользователь " + entry.getKey() + " младше 18 лет");
            }
        }

    }
}
package Collections_HomeWork.HashMap;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Мария", 27);
        map.put("Игорь", 29);
        map.put("Аркадий", 35);
        map.put("Борис", 44);
        map.put("Сергей", 40);
        System.out.println(map);
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Имя: " + entry.getKey() + ", Возраст: " + entry.getValue());
        }
    }
}




package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask7;

import java.util.*;

public class Main {
    // два типа-параметра сразу: K для ключей, V для значений — синтаксис тот же,
    // что у <T>, просто параметров двое
    public static <K, V> void printMap(Map<K, V> map){
        // Map.Entry<K, V> — типы K и V подставляются из сигнатуры метода,
        // поэтому getKey()/getValue() возвращают ровно K и V без кастов
        for(Map.Entry<K,V> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static void main(String[] args){
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Key1", 1);
        map1.put("Key2", 2);
        map1.put("Key3", 3);

        printMap(map1);


        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Key 1");
        map2.put(2,"Key 2");
        map2.put(3,"Key 3");
        map2.put(4,"Key 4");
        printMap(map2);

    }
}

package Collections_HomeWork.TreeMap;

import java.util.*;

public class TreeMap2 {
    public static void main(String[] args){
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Z", "Z");
        map.put("Zz", "Zz");
        map.put("Zzz", "Zzz");
        map.put("zzz", "zzz");
        map.put("ABC", "ABC");
        map.put("abc", "abc");
        map.put("a", "a");
        map.put("1", "1");
        map.put("12345567890", "1");
        System.out.println("Минимальный ключ: " + map.firstKey());
        System.out.println("Максимальный ключ: " + map.lastKey());
    }
}

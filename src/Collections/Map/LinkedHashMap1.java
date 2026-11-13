package Collections.Map;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args){
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

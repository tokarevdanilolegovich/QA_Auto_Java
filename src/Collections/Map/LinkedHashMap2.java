package Collections.Map;
import java.util.*;
public class LinkedHashMap2 {
    public static void main(String[] args){
        Map<String, String> capitals = new LinkedHashMap<>();

        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("Italy", "Rome");

        capitals.put("Germany", "Berlin 2.0"); // обновление значения НИКАК НЕ ВЛЯЕТ на ПОРЯДОК вывода,
        // ключи остаются на тех же местах в двухсвязном списке

        for (Map.Entry<String, String> entry : capitals.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

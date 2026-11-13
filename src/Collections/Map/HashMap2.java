package Collections.Map;
import java.util.*;
public class HashMap2 {
    public static void main(String[] args){
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Germany", "Berlin");
        capitals.put("Germany", "Berlin 2.0");

        System.out.println(capitals.get("Germany"));
        System.out.println(capitals.size());

    }
}

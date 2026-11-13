package practice_7_Collections.LinkedHashSet_HashMap_TreeMap;
import java.util.*;
public class HashMap_put_null {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put(null,"First");
        map.put(null,"Second");

        System.out.println(map.get(null));


    }
}

package Collections_HomeWork.TreeMap;

import java.util.*;

public class TreeMap1 {
    public static void main(String[] args){
        Map<String, Integer> results = new TreeMap<>();
        results.put("Alex", 5);
        results.put("Zac", 5);
        results.put("Bob", 4);
        results.put("Xan", 4);
        results.put("Chloe", 3);
        results.put("Mitchel", 3);
        results.put("Dan", 2);
        results.put("Eshly", 1);
        for(Map.Entry<String, Integer> entry : results.entrySet()){
            System.out.println(entry.getKey() + " - " +  entry.getValue());
        }
    }
}

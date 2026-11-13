package Collections_HomeWork.LinkedHashSet;

import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args){
        Set<String> strings = new LinkedHashSet<>();
        strings.add("First string");
        strings.add("Second string");
        strings.add("Third string");
        strings.add("Fourth string");
        strings.add("Fifth string");

        System.out.println(strings);
    }
}

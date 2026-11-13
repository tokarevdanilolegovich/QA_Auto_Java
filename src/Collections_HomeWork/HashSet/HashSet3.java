package Collections_HomeWork.HashSet;

import java.util.*;

public class HashSet3 {
    public static Set<String> removeDuplicates(List<String> input){

        Set<String> set = new HashSet<>();
        set.addAll(input);
        return set;
    }

    public static void main(String[] args){
        System.out.println(removeDuplicates(new LinkedList<>(List.of("A","A","A","B","B","c","c"))));
    }
}
;
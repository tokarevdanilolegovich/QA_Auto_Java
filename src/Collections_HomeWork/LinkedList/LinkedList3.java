package Collections_HomeWork.LinkedList;

import java.util.*;

public class LinkedList3 {
    public static void main(String[] args){
        List<String> strings = new LinkedList<>(List.of("First", "Second", "Third", "Fourth"));
        if(!strings.isEmpty()){
            System.out.println(strings.getFirst());
            System.out.println(strings.getLast());
        }
    }
}

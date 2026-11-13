package Collections_HomeWork.TreeSet;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args){
        Set<Integer> numbers = new TreeSet<>();
        for(int i = 0; i < 5; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}

package Collections_HomeWork.HashSet;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < 5; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        for(int e : numbers){
            System.out.print(e + " ");
        }

    }
}

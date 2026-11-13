package Collections_HomeWork.HashSet;

import java.util.*;

public class HashSet2 {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        if(numbers.contains(5)){
            System.out.println("Число 5 содержится в множестве");
        }
        else
            System.out.println("Число 5 не содержится в множестве");
    }
}

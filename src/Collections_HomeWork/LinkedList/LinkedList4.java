package Collections_HomeWork.LinkedList;

import java.util.*;

public class LinkedList4 {
    public static void main(String[] args){
        List<Integer> numbers = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,9,1,5,6,8,9,4,6,3,2));
        int sum = 0;
        for(int e : numbers){

            sum+= e;
        }
        System.out.println(sum);
    }
}

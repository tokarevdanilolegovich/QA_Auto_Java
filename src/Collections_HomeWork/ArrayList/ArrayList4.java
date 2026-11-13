package Collections_HomeWork.ArrayList;

import java.util.*;

public class ArrayList4 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            numbers.add(i);
        }
        int sum = 0;
        for(int e : numbers){
            sum+= e;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}

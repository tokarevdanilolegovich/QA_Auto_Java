package Collections_HomeWork.ArrayList;

import java.util.*;

public class ArrayList5 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(i);
        }
        System.out.println("Максимальное число через Collections.max: " + Collections.max(numbers));

        int max = numbers.get(0);
        for(int e : numbers){
            if(e > max){
                max = e;
            }
        }
        System.out.println("Максимальное число через ручной цикл: " +  max);
    }

}

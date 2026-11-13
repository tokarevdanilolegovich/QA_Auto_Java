package Collections_HomeWork.ArrayList;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(i);
        }
        //System.out.println(numbers);
//        numbers.forEach(e ->{
//                    if(e % 2 == 0){
//                        System.out.println(e);
//                    }
//        });
        for (int e : numbers){
            if(e % 2 == 0){
                System.out.println(e);
            }
        }
    }
}

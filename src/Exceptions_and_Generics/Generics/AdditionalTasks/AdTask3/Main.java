package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumbers(List.of(1,2,3,4,5,100));

        NumberBox<Double>  doubleBox = new NumberBox<>();
        doubleBox.setNumbers(List.of(1.5, 2.5, 0.25));

        System.out.println(intBox.getSum());
        System.out.println(doubleBox.getSum());
    }
}

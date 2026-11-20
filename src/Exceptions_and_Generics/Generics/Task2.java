package Exceptions_and_Generics.Generics;

import java.lang.reflect.Array;
import java.util.*;

public class Task2 {
    // <T> ПЕРЕД возвращаемым типом — объявление дженерик-метода:
    // метод обобщён независимо от класса, один код работает с Integer[] и String[]
    public static <T> void printArray( T[] array){
        for(T x : array){
            System.out.println(x);

        }
        System.out.println();
    };
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};
        String[] strings = {"str1","str2","str3"};
        printArray(numbers);

        printArray(strings);
    }
}

package practice_8_Exceptions_and_Generics.exceptions.unchecked;

import java.util.*;

public class IndexOutOfBoundExceptionExample {
    public static void main(String[] args){
        try{
            int[] numbers = {1,2,3};
            int number = numbers[5];//попытка доступа к несущетсвующему индексу
        }catch(IndexOutOfBoundsException e){
            System.out.println("Попытка доступа к индексу за пределами массива");
        }
    }
}

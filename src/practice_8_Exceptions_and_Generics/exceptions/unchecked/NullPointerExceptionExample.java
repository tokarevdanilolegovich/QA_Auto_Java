package practice_8_Exceptions_and_Generics.exceptions.unchecked;

import java.util.*;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        try{
            String text = null;
            int length = text.length(); //Это вызовет NullPointerException
        }catch(NullPointerException e){
            System.out.println("Попытка вызова метода у null объекта");
        }
    }
}
